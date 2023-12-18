input = open(r"input.txt","r")
a = input.readlines()
b = []
c = []
d = {}
f = []
for i in a:
    b.append(i.replace("\n",""))

def oneGame(game):
    final = []
    indexDots = game.index(":")
    game = game[indexDots+2:]
    game = game.replace("; ", ", ")
    game = game.split(", ")
    for i in range(0,len(game)):
        final.append(game[i].split())
    return final

def check(game):
    bigRed = int()
    bigBlue = int()
    bigGreen = int()
    for i in game:
        if i[1] == "red" and int(i[0]) >= bigRed:
            bigRed = int(i[0])
            print(i)
        if i[1] == "green" and int(i[0]) >= bigGreen:
            bigGreen = int(i[0])
            print(i)
        if i[1] == "blue" and int(i[0]) >= bigBlue:
            bigBlue = int(i[0])
            print(i)  
    return int(bigBlue*bigRed*bigGreen)


for i in b:
    c.append(oneGame(i))
sum = 0
for i in range(0,len(c)):
    sum = sum + check(c[i])

print(sum)