try:
    numerator = int(input("Enter a number to divide : "))
    denominator = int(input("Enter a number to divide by : "))
    result = numerator/denominator
except ZeroDivisionError as rror:
    print(rror)
    print("Don't use zero")
except ValueError as rror:
    print(rror)
    print("Just use numbers")
except Exception as rror:
    print(rror)
    print("something went wrong :(")
else:
    print(result) # only execute when there is no error
finally:
    print("This part will be always execute")
