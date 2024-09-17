def xuli(s):
    a = s[::2]
    b = s[1::2]
    tong = 0
    tich = 1
    for i in a:
        tong += int(i)
    if b == '0'*len(b):
        tich = 0
    else:
        for i in b:
            if int(i) != 0:
                tich *= int(i)
    print(tong,tich,sep=' ',end='\n')
    return
n = int(input())
for _ in range(n):
    xuli(input())
