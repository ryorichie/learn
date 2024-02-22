def hello(first, middle, last):
    print("Hello " + first + " " + middle + " " + last)
    print("Have a nice day")

hello("Yohanes", "Eko", "Susanto") # positional argument
hello(last="Susanto", first="Yohanes", middle="Eko") # keyword argument, position doesn't matters