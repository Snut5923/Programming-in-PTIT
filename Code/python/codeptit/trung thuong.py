from math import *
def xuli():
    n = int(input())
    a = []
    res = 0
    for _ in range(n):
        a.append(int(input()))
    b = list(set(a))
    c ={}
    d = []
    for i in b:
        res = max(res,a.count(i))
        c[i] = a.count(i)
    for i in c:
        if c[i] == res:
            d.append(i)
    d.sort()
    print(d[0])
    return
tc = int(input())
for _ in range(tc):
    xuli()