with open('file.txt') as file: ## close the file
    print(file.read())

print(file.closed())