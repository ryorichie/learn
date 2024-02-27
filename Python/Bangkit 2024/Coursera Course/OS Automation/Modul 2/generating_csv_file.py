import csv
data = [["workstation.local", "192.168.25.46"], ["webserver.cloud", "192.168.22.2"]]
with open ('hosts.csv', 'w') as hosts_csv:
    writer = csv.writer(hosts_csv)
    writer.writerows(data)