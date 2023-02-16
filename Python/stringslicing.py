#indexing
name = "Ryo Richie"

#[start: stop: step]
# first_name = name[0:3] 
first_name = name[:3] # short hand way
# last_name = name[4:10]
last_name = name[4:] # short hand way
# funky_name = name[0:10:2]
funky_name = name[::2] # short hand way
reversed_name = name[::-1]

print(first_name)
print(last_name)
print(funky_name)
print(reversed_name)

# slicing
website1 = "http://bing.com"
website2 = "http://wikipedia.com"
sliceprofile = slice(7, -4, )

print(website1[sliceprofile],website2[sliceprofile])