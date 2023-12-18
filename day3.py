input = open(r"input3.txt","r")
a = input.readlines()
b = []
for i in a:
    b.append(i.replace("\n", ""))

def check(m, r, q, s):
    lenX = len(r)-1
    if len(q) != 0:
        x = q[0][1]
        y = q[0][0]
        if x < lenX and m[y][x].isdigit():
            return checkNum(m,q,[],s,"")
        if x < lenX and not m[y][x].isdigit():
            q.append((y,x + 1))
            q.pop(0)
            return check(m, r, q, s)
    return int(s)

def checkNum(m, q, k, s, t):
    x = q[0][1]
    y = q[0][0]
    lenX = len(m[y]) - 1
    
    if m[y][x].isdigit() and x < lenX:
        q.append((y, x + 1))
        q.pop(0)
        k.append((y, x))
        t = t + str(m[y][x])
        return checkNum(m, q, k, s, t)
    elif m[y][x].isdigit() and lenX == x:
        q.pop(0)
        k.append((y, x))
        t = t + str(m[y][x])
        if checkSym(m, k):
            s = s + int(t)
            return check(m, m[y], q, s)
        else:
            return check(m, m[y], q, s)
            
    else:
        q.pop(0)
        if x < lenX:
            q.append((y, x + 1))
        if checkSym(m, k):
            s = s + int(t)
            return check(m, m[y], q, s)
        else:
            return check(m, m[y], q, s)
        
def checkSym(m, k):
    xMin = k[0][1]
    xMax = k[len(k)-1][1]
    yMin = k[0][0]
    yMax = yMin
    lenX = len(m[y])-1
    lenY = len(m)-1

    if xMin >= 1:
        xMin = xMin - 1
    if xMax < lenX:
        xMax = xMax + 1
    if yMin > 0:
        yMin = yMin - 1
    if yMax < lenY:
        yMax = yMax + 1

    for i in range(yMin, yMax+1):
        for j in range(xMin, xMax+1):
            if not m[i][j].isdigit() and m[i][j] != ".":
                return True
    
    return False


q = [(0, 0)]
s = 0
y = 0
t = 0
sum = 0

for i in b:
    t = check(b, i, q, s)
    sum = sum + t
    y = y + 1
    q = [(y, 0)]

print(sum)