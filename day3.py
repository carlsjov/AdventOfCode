input = open(r"input3.txt","r")
a = input.readlines()
m = []
for i in a:
    m.append(i.replace("\n", ""))

def check(m,i,q,s):
    while len(q) > 0:
        x = q[0][1]
        y = q[0][0]
        lenX = len(i)
        if m[y][x] == "*":
            minY = y
            maxY = y
            minX = x
            maxX = x
            if y-1 >= 0:
                minY = y-1
            if y+1 < len(m):
                maxY = y+1
            if x-1 >= 0:
                minX = x-1
            if x+1 < lenX:
                maxX = x+1
            q2 = []
            k = [(y,x)]
            for j in range(minY,maxY+1):
                for l in range(minX,maxX+1):
                    if (j,l) not in k:
                        q2.append((j,l))
            #t = readNumbers(m,q2,k,temp=[])
            #if len(t) == 2:
            #    s = s + t[0]*t[1]
        if x+1 < lenX:
            q.append((y,x+1))
            q.pop(0)
            return check(m,i,q,s)
        else:
            q.pop(0)
            return check(m,i,q,s)
    return s

def readNumbers(m,q2,k,temp):
    if len(q2) != 0:
        x = q2[0][1]
        y = q2[0][0]
        if m[y][x].isdigit():
            print(m[y][x])
        q2.pop(0)
        return readNumbers(m,q2,k,temp)


q = [(0, 0)]
s = 0
y = 0
t = 0
sum = 0

for i in m:
    t = check(m, i, q, s)
    sum = sum + t
    y = y + 1
    q = [(y, 0)]

print(sum)