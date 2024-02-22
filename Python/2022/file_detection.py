import os

path = "..\\Python\\file\\file.txt"

if os.path.exists(path):
    print("That location is exists!")
    if os.path.isfile(path):
        print("That's file")
    elif os.path.isdir(path):
        print("That's Dir")
else:
    print("That location doesn't exist")
