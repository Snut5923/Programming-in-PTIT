def tong(s):
    tong = 0
    while s:
        tong += s%10
        s//=10
    return tong
for _ in range(int(input())):
    n = int(input())
    a = list(map(int,input().split()))
    mp ={}
    a.sort()
    b =[]
    for i in a:
        x = tong(i)
        if x not in mp:
            mp[x] = str(i)
            b.append(x)
        else:
            mp[x] += ' '+str(i)
    b.sort()
    for i in b:
        print(mp[i],end=' ')
    print()
