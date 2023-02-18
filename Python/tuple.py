# tuple, collection which oredered and unchangeable

student = ("Ryo", 19, "Male")

print(student.count("Ryo"))
print(student.index("Male"))

for x in student:
    print(x)

if "Ryo" in student:
    print("Ryo is here")