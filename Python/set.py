# set, unordered, unindex, and have no duplicae value; it's faster than list

utensils = {"fork", "chainsaw", "knife"}
dish = {"fish", "octopus", "chicken", "knife"}

print(str(utensils.difference(dish)), " difference") # what utensils have, but dish doesn't

print(str(utensils.intersection(dish)), " intersection") # what utensils have, but dish doesn't

utensils.add("blower")
utensils.remove("chainsaw")
# utensils.clear() to clear a set
utensils.update(dish) # add dish to utensils
# dish.update(utensils) # add dish to utensils
dinner = utensils.union(dish) # combine 2 sets to new variable


for x in utensils:
    print(x + "utensils")

print("\n")

for x in dish:
    print(x + "dish")

print("\n")

for x in dinner:
    print(x + "dinner")