food = ["pizza", "indomie", "nasi", "egg"]

food[0] = "soup"
food.append("es krim")
food.remove("egg")
food.pop()
food.insert(0, "kue")
food.sort()


print(food[0])

for i in food:
    print(i)

food.clear()

if food == []:
    print("food is empty")