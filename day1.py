input = open(r"input.txt","r")
b = input.readlines()
sum = 0

def laskeRivi(txt):
    temp = ""
    for i in txt:
        if i.isdigit() and i != '\n':
            temp += str(i)
        
    if temp == "":
        return 0
    else: 
        num = temp[0]+temp[len(temp)-1]
        return int(num)


for i in b:
    sum += laskeRivi(i)

print(sum)