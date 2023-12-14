input = open(r"input.txt","r")
b = input.readlines()
sum = 0

def laskeRivi(txt):
    first = ""
    second = ""
    var = False

    while var == False:
        for i in range(0,len(txt)-1):
            first = first + txt[i]
            if first.find("1") >= 0 or first.find("one") >= 0:
                first = "1"
                var = True
                break
            if first.find("2") >= 0 or first.find("two") >= 0:
                first = "2"
                var = True
                break
            if first.find("3") >= 0 or first.find("three") >= 0:
                first = "3"
                var = True
                break
            if first.find("4") >= 0 or first.find("four") >= 0:
                first = "4"
                var = True
                break
            if first.find("5") >= 0 or first.find("five") >= 0:
                first = "5"
                var = True
                break
            if first.find("6") >= 0 or first.find("six") >= 0:
                first = "6"
                var = True
                break
            if first.find("7") >= 0 or first.find("seven") >= 0:
                first = "7"
                var = True
                break
            if first.find("8") >= 0 or first.find("eight") >= 0:
                first = "8"
                var = True
                break
            if first.find("9") >= 0 or first.find("nine") >= 0:
                first = "9"
                var = True
                break
            """if first.find("0") >= 0 or first.find("zero"):
                first = "0"
                var = True
                break"""
        
        if len(first) == len(txt):
            return 00
        
        var = False
        second = first
        print(second)
        first = ""

        while var == False:
            for i in range(len(txt)-1,-1,-1):
                first = txt[i] + first
                print(first)
                if first.find("1") >= 0 or first.find("one") >= 0:
                    first = "1"
                    var = True
                    break
                if first.find("2") >= 0 or first.find("two") >= 0:
                    first = "2"
                    var = True
                    break
                if first.find("3") >= 0 or first.find("three") >= 0:
                    first = "3"
                    var = True
                    break
                if first.find("4") >= 0 or first.find("four") >= 0:
                    first = "4"
                    var = True
                    break
                if first.find("5") >= 0 or first.find("five") >= 0:
                    first = "5"
                    var = True
                    break
                if first.find("6") >= 0 or first.find("six") >= 0:
                    first = "6"
                    var = True
                    break
                if first.find("7") >= 0 or first.find("seven") >= 0:
                    first = "7"
                    var = True
                    break
                if first.find("8") >= 0 or first.find("eight") >= 0:
                    first = "8"
                    var = True
                    break
                if first.find("9") >= 0 or first.find("nine") >= 0:
                    first = "9"
                    var = True
                    break
                """if first.find("0") >= 0 or first.find("zero"):
                    first = "0"
                    var = True
                    break"""
                
        print(first)
        second = second + first
        print(second)
        return int(second)


for i in b:
    sum += laskeRivi(i)

print(sum)