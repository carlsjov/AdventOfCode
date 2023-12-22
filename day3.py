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
        if m[y][x] == "*":
            s = s + checkSym(m,(y,x))
            q.pop(0)
            if x == lenX:
                return int(s)
            else:
                q.append((y,x+1))
                return check(m,r,q,s)
        if x != lenX and m[y][x] != "*":
            q.append((y,x + 1))
            q.pop(0)
            return check(m, r, q, s)
    return int(s)

def checkSym(m,point):
    x = point[1]
    y = point[0]
    lenX = len(m[y])-1
    lenY = len(m)-1
    numbers = []
    k = []
    q2=[]
    k2=[]
    if x >= 1:
        xMin = x - 1
    if x < lenX:
        xMax = x + 1
    if y > 0:
        yMin = y - 1
    if y < lenY:
        yMax = y + 1

    for i in range(yMin, yMax+1):
        for j in range(xMin, xMax+1):
            if m[i][j].isdigit() and (i,j) not in k2:
                k.append((i,j))
                t = checkNum(m,k,q2)
                num = t[0]
                k2.append(t[1]) 
                print(k2)
                numbers.append(int(num))
    
    if len(numbers) == 2:
        return int(numbers[0]*numbers[1])        
    return 0

def checkNum(m,k,q2):
    if len(k) != 0:
        x = k[0][1]
        y = k[0][0]
        lenX = len(m[y])-1
    q2.append((y,x))
    if x < lenX and m[y][x+1].isdigit() and (y,x+1) not in q2:
        k.append((y, x + 1))
        k.pop(0)
        return checkNum(m, k, q2)
    if x > 0 and m[y][x-1].isdigit() and (y,x-1) not in q2:
        k.append((y, x - 1))
        k.pop(0)
        return checkNum(m, k, q2)
    else: 
        t=""
        q2.sort()
        print(q2)
        for i in range(len(k)):
            t = t + str(m[q2[i][0]][q2[i][1]])
        print(t)
        return int(t),q2
    return 0,q2


"""def checkNum(m, q, k, s, t):
    x = q[0][1]
    y = q[0][0]
    lenX = len(m[y]) - 1
    
    if m[y][x] == "*" and x < lenX:
        q.append((y, x + 1))
        q.pop(0)
        k.append((y, x))
        return checkNum(m, q, k, s, t)
    elif m[y][x] == "*" and lenX == x:
        q.pop(0)
        k.append((y, x))
        s = s + checkSym(m,k)
        return check(m, m[y], q, s)            
    else:
        q.pop(0)
        if x < lenX:
            q.append((y, x + 1))
        s = s + checkSym(m,k)
        return check(m, m[y], q, s)
        
        
def checkSym(m, k):
    xMin = k[0][1]
    xMax = k[len(k)-1][1]
    yMin = k[0][0]
    yMax = yMin
    lenX = len(m[y])-1
    lenY = len(m)-1
    numbers = []

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
            if m[i][j].isdigit():
                numbers.append(int(m[i][j]))
    print(len(numbers))    
    if len(numbers) == 2:
        return int(numbers[0]*numbers[1])        
    return 0"""


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