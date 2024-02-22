text = "I write this file\n Youuuuuuuu"

with open('test_file.txt', 'w') as file:
    file.write(text)

with open('test_file.txt', 'r') as file:
    print(file.read())