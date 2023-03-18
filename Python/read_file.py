with open('file.tx') as file: ## close the file
    print(file.read())

print(file.closed())