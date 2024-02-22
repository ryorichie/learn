name = "ryo Richie"

if(name[0].islower):
    name = name.capitalize()

first_name = name[:3].upper()
last_name = name[4:].lower()
last_character = name[-1]

print(last_character)
print(last_name)
print(first_name)
print(name)