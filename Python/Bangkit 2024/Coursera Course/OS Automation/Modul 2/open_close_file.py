# open and closing file sequence
file = open("spider.txt")
print(file.readline())
print(file.read())
file.close()

# how to not forget to close the file
with open("spider.txt") as file:
    print(file.readline())
