# kwargs, pack all argument into dictionary

def hello(**stuff):
    print("Hello " + stuff['first'] + " " + stuff['last'])
    print("hello", end=" ")
    for key,value in stuff.items():
        print(value, end=" ")

hello(first="Ryo", last="Richie", middle="Smas")