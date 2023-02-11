temp = int(input("What is temperature today ? "))

if not(temp < 0 or temp > 30):
    print("The temperatur is " + str(temp) + "C, have a nice day\ngo outside please")
elif not(temp >= 0 and temp <= 30): 
    print("The temperatur is " + str(temp) + "C, it's a bad day\ndon't go outside please")
