def xuli(s):
    a = list(s)
    kq =""
    if len(s) > 1:
        for i in range(len(s)-1,-1,-1):
            if(int(a[i]) >= 5 and i>0):
                a[i] = "0"
                a[i-1] = str(int(a[i-1])+1)
            else:
                if i>0: a[i] = "0"
            kq = a[i] + kq
        return kq
    return s
n = int(input())
for _ in range(n):
    s = input()
    print(xuli(s))
