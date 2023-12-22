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
            s = s + readNumbers(m,q2,k)            
        if x+1 < lenX:
            q.append((y,x+1))
            q.pop(0)
            return check(m,i,q,s)
        else:
            q.pop(0)
            return check(m,i,q,s)
    return s

def readNumbers(m,q2,k):
    numbers = []
    for i in q2:
        x = i[1]
        y = i[0]
        ind = []
        temp = ""
        if m[y][x].isdigit() and (y,x) not in k:
            k.append((y,x))
            ind.append((y,x))
            var = True
            xPlus = x
            xMinus = x
            while var:
                if  xPlus+1 < len(m[y]) and  m[y][xPlus+1].isdigit() and (y,xPlus+1) not in k:
                    k.append((y,xPlus+1))
                    ind.append((y,xPlus+1))
                    xPlus = xPlus+1
                else:
                    var = False
            var = True
            while var:
                if  xMinus-1 >= 0 and  m[y][xMinus-1].isdigit() and (y,xMinus-1) not in k:
                    k.append((y,xMinus-1))
                    ind.append((y,xMinus-1))
                    xMinus = xMinus-1
                else:
                    var = False
            ind.sort()
            for j in ind:
                temp = temp + str(m[j[0]][j[1]])
            numbers.append(int(temp))
    
    if len(numbers) == 2:
        sum = numbers[0]*numbers[1]
    else:
        sum = 0
    return sum


            


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