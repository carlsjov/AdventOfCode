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
    for i in game:
        if i[1] == "red" and int(i[0]) > 12:
            return False
        if i[1] == "green" and int(i[0]) > 13:
            return False
        if i[1] == "blue" and int(i[0]) > 14:
            return False
        
    return True


for i in b:
    c.append(oneGame(i))
sum = 0
for i in range(0,len(c)-1):
    if check(c[i]):
        print(check(c[i]))
        sum = sum +i+1

print(sum)