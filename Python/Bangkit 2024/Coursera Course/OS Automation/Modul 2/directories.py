import os
# print(os.getcwd()) # return current working directory
# os.mkdir("new folder")
# os.chdir("new folder") # change directory to working with
# os.rmdir("new folder")
# os.listdir("new folder") # return list of file and directory

print(os.listdir())

for name in os.listdir():
    fullname = os.path.join(name) # make sure to work in all OS
    if os.path.isdir(fullname):
        print(f"{fullname} is a direcotry")
    else:
        print(f"{fullname} is a file")   