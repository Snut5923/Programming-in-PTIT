from math import *
def xoay(x,y):
    dem = 0
    for i in range(len(y)):
        if x != y:
            dem+=1
            x = x[1::] + x[0]
        else:
            return dem
    if x!=y: return -1
n = int(input())
a = []
for _ in range(n):
    a.append(input())
kq = 10**5
ok = 1
for i in range(n):
    dem = 0
    for j in range(n):
        if i!=j:
            x = xoay(a[j],a[i])
            if x == -1:
                ok = 0
                break
            else:
                dem += x
    kq = min(kq,dem)
if ok == 1: print(kq)
else: print('-1')


