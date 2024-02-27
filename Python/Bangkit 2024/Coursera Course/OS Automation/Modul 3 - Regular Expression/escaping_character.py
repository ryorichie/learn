import re
print(re.search(r".com", "welcome"))
print(re.search(r"\.com", "welcome")) # \ = escape character, make it become commoners
print(re.search(r"\.com", "mydomain.com"))
print(re.search(r"\w*", "This is an example")) # \n \t \w have other function
print(re.search(r"\w*", "And_this_is_another")) # \w match all character except spaces
# \d for character \s for space \b for word boundaries