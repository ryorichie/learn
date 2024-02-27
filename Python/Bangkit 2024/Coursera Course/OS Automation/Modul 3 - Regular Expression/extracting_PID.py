import re
log = "July 31 07:51:48 mycomputer bad_process[12345]: ERROR Performing package upgrade"
regex = r"\[(\d+)\]"
result = re.search(regex, log)
print(result)
result = re.search(regex, "A completely different string that also has numbers [34567]")
print(result)
result = re.search(regex, "99 elephants in a [cage]")
print(result)

def extract_pid(log_line):
    regex = r"\[(\d+)\]"
    result = re.search(regex, log_line)
    if result is None:
        return "" # if none don't error
    return result[1]
 
print(extract_pid(log))
print(extract_pid("99 elephants in a [cage]"))