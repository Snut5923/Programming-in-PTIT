from math import *
def nt(n):
    for i in range(2,int(sqrt(n))+1):
        if n%i==0: return False
    return n>1
n = int(input())
a = list(map(int,input().split()))
kq = []
for i in a:
    dem = 0
    if not nt(i):
        l = i - 1
        r = i + 1
        while not nt(l) and not nt(r):
            l -= 1
            r += 1
        if nt(l):
            dem = i - l
        if nt(r):
            dem = r - i
    kq.append(dem)
print(max(kq))
