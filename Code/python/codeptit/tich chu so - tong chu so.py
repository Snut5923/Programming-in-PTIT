def xili(s):
    a = s[::2]
    b = s[1::2]
    tong = 0
    tich = 1
    for i in a:
        if int(i)!=0:
            tich *= int(i)
    for i in b:
        tong += int(i)
    print(tich,tong,sep=' ',end='\n')
    return
n = int(input())
for _ in range(n):
    xili(input())