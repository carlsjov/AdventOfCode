input = open(r"input4.txt","r")
a = input.readlines()
m = []
for i in a:
    m.append(i.replace("\n", ""))

all = []
for i in m:
    all.append(i.split("|"))

cards = []
numbers = []
for i in all:
    cards.append(i[0].split())
    numbers.append(i[1].split())

for i in range(len(cards)):
    cards[i].pop(0)
    cards[i].pop(0)

s = 0
wins = []
for i in range(len(cards)):
    for j in range(len(cards[i])):
        if cards[i][j] in numbers[i]:
            s = s+1
    wins.append(s)        
    s = 0

pieces =[]
for i in range(len(cards)):
    pieces.append(1)

def checkPieces(p,w,x):
    if x < len(p):
        for i in range(0,p[x]):
            newX = x
            if newX+1 < len(p):
                newX = newX + 1
            for j in range(0,w[x]):
                p[newX] = p[newX]+1
                if newX +1 < len(p):
                    newX = newX +1
        return checkPieces(p,w,x+1)
    return p

pieces = checkPieces(pieces,wins,x=0)
print(wins)
print(pieces)
sum = 0
for i in pieces:
    sum = sum + i
print(sum)