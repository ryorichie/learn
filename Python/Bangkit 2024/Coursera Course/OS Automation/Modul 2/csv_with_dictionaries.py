import csv

# read csv
with open ("software.csv") as software:
    reader = csv.DictReader(software)
    for row in reader:
        print("{} has {} users".format(row["name"], row["users"]))
        
        
# write csv
users = [ {"name": "Sol Mansi", "username": "solm", "department": "IT infrastructure"},
{"name": "Lio Nelson", "username": "lion", "department": "User Experience Research"},
{"name": "Charlie Grey", "username": "greyc", "department": "Development"}]
keys = ["name", "username", "department"]

with open ("by_departement.csv", "w") as files:
    writer = csv.DictWriter(files, fieldnames=keys)
    writer.writeheader()
    writer.writerows(users)