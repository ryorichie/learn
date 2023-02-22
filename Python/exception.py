try:
    numerator = int(input("Enter a number to divide : "))
    denominator = int(input("Enter a number to divide by : "))
    result = numerator/denominator
    print(result)
except ZeroDivisionError as e:
    print(e)
    print("Don't use zero")
except ValueError as e:
    print(e)
    print("Just use numbers")
except Exception as e:
    print(e)
    print("something went wrong :(")

