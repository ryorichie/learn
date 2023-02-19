# packed all element into tuple

def add(*stuff):
    sum = 0
    stuff = list(stuff) # stuff need to be cast to list for it to be change
    stuff[0] = 0
    # stuff[0] = 0, you can modify tuple by index
    for i in stuff:
        sum += i
    return sum

print(add(1,2,3,4,5,6,7,8,9,10))