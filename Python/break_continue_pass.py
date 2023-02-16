# break = terminate loop
# continue = skips to the next iteration
# pass = place holder, does nothing

while True:
    name = input("Enter your name: ") # input is loop by default, JIC
    if name != "":
        break

phone_number = "0882-764-08051"

for i in phone_number:
    if i == "-":
        continue
    print(i, end="")

for i in range(1,21):

    if i == 13:
        pass # it's literally doing nothing
    else:
        print(i)