string1 = "I love python"
string2 = string1[7:13] # get seires of character
string3 = string1[-6] # get one character count back
string4 = string1[4] # get one character from front
string5 = string1[0::2] # skip 1 character
stirng6 = string1[::-1] # backward reading

#structur varname[start:end:hops]

print(string2)
print(string3)
print(string4)
print(string5)

# phonenum slicer
def format_phone(phonenum):
    area_code = "(" + phonenum[:3] + ")"
    exchange = phonenum[3:6]
    line = phonenum[-8:]
    return area_code + " " + exchange + "-" + line

print(format_phone("+6288276408051"))