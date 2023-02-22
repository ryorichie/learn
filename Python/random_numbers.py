import random

x = random.randint(1, 6)
y = random.random()

myList = ['Rock', 'Paper', 'Scissor']
cards = [1, 2, 3, 4, 5, 6, 7, 8, 9, 'J', 'Q', 'K', 'A']
z = random.choices(myList)
random.shuffle(cards)
print(cards)

print(myList[random.randint(0, 2)])
print(x)
print(y)
print(z)
