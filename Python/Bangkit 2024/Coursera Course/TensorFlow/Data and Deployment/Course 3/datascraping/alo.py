import requests
from bs4 import BeautifulSoup
import html
import json
import re
import concurrent.futures

# Make a request to the website
mainurl = "https://www.alodokter.com"

def scrape_page(i):
    while True:
        try:
            url = f"https://www.alodokter.com/komunitas/diskusi/penyakit/page/{i}"
            response = requests.get(url)

            soup = BeautifulSoup(response.content, 'html.parser')

            # Find all card-topic elements
            href_links = [link.get('href') for link in soup.find_all('card-topic')]

            def scrape_content(link):
                try:
                    child_url = mainurl + link
                    responses = requests.get(child_url)
                    souper = BeautifulSoup(responses.content, 'html.parser')
                    
                    title = souper.find('detail-topic').get('member-topic-content')
                    content = souper.find('doctor-topic').get('doctor-topic-content')
                except AttributeError:
                    return scrape_content(link)
                return title[1:-1], content[1:-1]

            with concurrent.futures.ThreadPoolExecutor() as executor:
                results = executor.map(scrape_content, href_links)

            all_title, all_content = zip(*results)
            break
        except ValueError:
            continue

    def html_decode(text):
        teks = text.replace('\\n', '\n').replace('\\u003c', '\u003c').replace('\\u003e', '\u003e').replace('\\u00a0', '\u00a0')
        teks = re.sub(r'<a href=".*?" target="_blank">(.*?)</a>', r'\1', teks)
        teks = re.sub(r'<li>', '--> ', teks)
        teks = re.sub(r"<[^>]+>", "", teks)
        # teks = re.sub(r'<p>(.*?)</p>', r'\1', teks)
        return teks
    
    all_content = [html_decode(content) for content in all_content]
    all_title = [html_decode(title) for title in all_title]

    # write data to json file

    data = list(zip(all_title, all_content))
    with open(f'data alodokter/page{i}.json', 'w') as f:
        json.dump(data, f, indent=4)
    print("Page {} done".format(i))

with concurrent.futures.ThreadPoolExecutor(max_workers=4) as executor:
    executor.map(scrape_page, range(6755, 10000))