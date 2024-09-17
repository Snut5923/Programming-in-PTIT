from math import *
t = int(input())
a = list(map(int,input().split()))
a.sort()
if t == 2:
    res = a[0]*a[1]
else:
    x1 = a[0]*a[1]
    x2 = a[0]*a[1]*a[2]
    x = max(x1,x2)
    x3 = a[-1]*a[-2]
    x4 = a[-1]*a[-2]*a[-3]
    x5 = a[0]*a[1]*a[-1]
    y = max(x3,x4)
    res = max(x,y)
    res = max(res,x5)
print(res)