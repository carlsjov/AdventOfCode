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

s = -1
sum = 0
for i in range(len(cards)):
    for j in range(len(cards[i])):
        if cards[i][j] in numbers[i]:
            s = s+1
    if s != -1:
        sum = sum + pow(2,s)
    s = -1

print(sum)
    