import re
result = re.search(r"aza", "plaza")
print(re.search(r"h$", "mesh"))
print(re.search(r"g.ing", "ongoing"))
print(re.search(r"g.ing", "onGoing"))
print(re.search(r"p.n", "sPangking", re.IGNORECASE))
print(result)