file_counts = {"jpg":10, "txt":14, "svg":23, "html":7, "psd":32}
print(file_counts["txt"])
file_counts["txt"] = 23
print(file_counts)
del file_counts["jpg"]
print(file_counts)

for extension in file_counts:
    print(extension)
    
for ext, amount in file_counts.items():
    print(f"There are {amount} files with the .{ext} extension")
    
print(file_counts.keys()) # get key
print(file_counts.values()) # get value


def count_letters(text):
    result = {}
    for letter in text:
        if letter not in result:
            result[letter] = 0 # initialize value
        result[letter] +=1
    return result

print(count_letters("you can count this right"))


