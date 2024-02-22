animal = "cow"
item = "moon"

# print("The " + animal + " jumped over the " + item), usual method
print("The {} jumped over the {}".format(animal,item))
print("The {1} jumped over the {0}".format(item,animal)) # positional argument
print("The {1} jumped over the {1}".format(item,animal)) # positional argument
print("The {animal} jumped over the {item}".format(animal="cow", item="moon")) # keyword argument
print("The {animal} jumped over the {animal}".format(animal="cow", item="moon")) # keyword argument

text = "The {} jumped over the {}".format(item, animal)
print(text)

name = "Ryo"

print("Hello, my name is {} Nice to meet you".format(name))
print("Hello, my name is {:10} Nice to meet you".format(name))
print("Hello, my name is {name:10} Nice to meet you".format(name="Ryo"))
print("Hello, my name is {:>10} Nice to meet you".format(name)) # right align
print("Hello, my name is {:<10} Nice to meet you".format(name)) # left align
print("Hello, my name is {:^10} Nice to meet you".format(name)) # center align

number = 3.13159
thousand = 211300

print("The number is {:,}".format(thousand))
print("The number pi is {:.2f}".format(number))
print("The number in binary is {:b}".format(thousand))
print("The number in octal is {:o}".format(thousand))
print("The number in hexadecimal is {:x}".format(thousand))
print("The number in scientific notation is {:E}".format(thousand))
