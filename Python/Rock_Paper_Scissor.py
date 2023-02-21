import random

rps = {
    "rock":1,
    "paper":2,
    "scissor":3,
}


myList = ["rock", "paper", "scissor"]
Opponent_int = randint(0,2)
Opponent = myList(Opponent_int)

Myself = input("Chose between rock, paper, scissor")
Myself_int = rps.get(Myself)
print("I choose {} and you choose {}")

if Myself_int == Opponent_int :
    print("We are draw")
elif Myself_int+1 == Opponent_int :
    print("You Lose")
elif Myself_int-1 == Opponent_int :
    print("You Win")
elif Myself_int-1 == Opponent_int :
    print("You Win")
