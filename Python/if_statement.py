age = int(input("how old are you ?"))

if age == 100:
    print("you're century old!")
elif age >= 18:
    print("you're an adult")
elif age < 0:
    print("you haven't been born yet!")
else:
    print("You're not an adult")