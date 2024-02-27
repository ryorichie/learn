with open("spider.txt") as file:
    for line in file:
        print(line.strip().upper())
        
file = open("spider.txt")
lines = file.readlines()
file.close()
print(lines)