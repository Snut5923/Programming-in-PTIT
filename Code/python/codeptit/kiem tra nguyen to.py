from math import *
def nt(n):
    for i in range(2,int(sqrt(n))+1):
        if n%i==0: return False
    return n>1
s = list(map(int,input().split()))
n = s[0]
m = s[1]
a = []
for _ in range(n):
    a.append(list(map(int,input().split())))
for i in range(n):
    for j in range(m):
        if nt(a[i][j]):
            print('1',end=' ')
        else: print('0',end=' ')
    print()