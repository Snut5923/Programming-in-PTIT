from math import *
def tao(s,n,i,j,k,a):
    if len(a) == 1000: return
    if len(s) == n and k > i+j:
        a.add(int(s))
    if len(s) < n:
        tao(s+'0',n,i+1,j,k,a)
        tao(s+'1',n,i,j+1,k,a)
        tao(s+'2',n,i,j,k+1,a)
a = set()
i = 1
while True:
    if len(a) == 1000: break
    tao('',i,0,0,0,a)
    i+=1
a = sorted(list(a))
for _ in range(int(input())):
    n = int(input())
    for i in range(n):
        print(a[i],end=' ')
    print()