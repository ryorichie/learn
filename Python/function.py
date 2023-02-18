def hello(name):
    print("Hello " + name)
    print("Have a nice day")

def hello_3var(first_name, last_name, edge): # need matching number of variable
    print("Hello " + first_name + " " + last_name)
    print("And you're " + str(edge) + " years old")
    print("Have a nice day")

my_name = "Ryo Richie"
hello_3var("Ryo", "Richie", 18)
hello("Ryo")
hello(my_name)
hello("Dude")