rows = int(input("how many rows do you want ? "))
columns = int(input("How many column do you want ? "))
symbol = (input("Enter character to use ? "))

for i in range(rows):
    for i in range(columns):
        print(symbol, end = " ")
    print()