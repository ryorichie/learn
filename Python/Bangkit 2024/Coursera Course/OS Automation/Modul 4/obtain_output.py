import subprocess
result = subprocess.run(["rm", "does_not_exist"], capture_output=True)
print(result.returncode)
print(result.stdout)
print(result.stderr)

result = subprocess.run(["nslookup", "8.8.8.8"], capture_output=True)

result = subprocess.run(["nslookup", "8.8.8.8"], capture_output=True)
print(result.returncode)

result = subprocess.run(["nslookup", "8.8.8.8"], capture_output=True)
print(result.stdout)

result = subprocess.run(["nslookup", "8.8.8.8"], capture_output=True)
print(result.stdout.decode().split())