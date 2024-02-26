losers = ["Ashew", "Matanda", "Messiah", "Picaro"]
for ind, orang in enumerate(losers):
    print(f"{ind} - {orang}")

def full_emails(orang):
    result = []
    for email, name in orang:
        result.append(f"{name} <{email}>")
    return result

print(full_emails([("ryorichie@gmail.com", "Ryo Richie"), ("santamonica@gmail.com", "Santa Monica")]))