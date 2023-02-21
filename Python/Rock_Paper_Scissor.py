import random

rps = {
    "rock":1,
    "paper":2,
    "scissor":3,
}


myList = ["rock", "paper", "scissor"]
Opponent_int = random.randint(1,3)
Opponent = myList[Opponent_int-1]

Myself = input("Chose between rock, paper, scissor\n")
Myself_int = rps.get(Myself)
print("I choose {} and you choose {}".format(Opponent, Myself))

if Myself_int == Opponent_int :
    print("We are draw")
elif Myself_int+2 == Opponent_int :
    print("You Lose")
elif Myself_int+1 == Opponent_int :
    print("You Lose")
elif Myself_int-2 == Opponent_int :
    print("You Win")
elif Myself_int-1 == Opponent_int :
    print("You Win")
