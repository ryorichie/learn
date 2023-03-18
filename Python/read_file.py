try:
    with open('file.txt') as file: ## close the file
        print(file.read())
except FileNotFoundError:
    print('File not found')
print(file.closed)