if __name__ == '__main__':
    n = int(input())
    for _ in range(n):
        a = []
        s = input()
        x = 0
        tmp = 0
        for i in range (len(s)):
            if(s[i].isdigit()):
                x = x*10 + int(s[i])
                tmp = 1
                if(i==len(s)-1): a.append(x)
            else:
                if tmp!=0:
                    a.append(x)
                    x = 0
                    tmp = 0
        a.sort(reverse=True)
        print(a[0])