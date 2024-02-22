def display_name():
    name = "Richie" # this is local variable
    # name = "Richie" # If disable like this display_name will use global var
    print(name)

# print(name), can't do this

name = "Ryo Richie" # this is global variable
# Local -> Enclosing -> Global -> Built-in, variable order
display_name()
print(name)