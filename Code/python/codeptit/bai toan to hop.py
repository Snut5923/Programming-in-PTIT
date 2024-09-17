from math import *
a = [0]*21
b = []
def inkq(k):
    for i in range(1,k+1):
        print(b[a[i]-1],end=' ')
    print()
def ql(i,n,k):
    for j in range(a[i-1]+1,n-k+i+1):
        a[i] = j
        if i == k:
            inkq(k)
        else:
            ql(i+1,n,k)
c = list(map(int,input().split()))
k = c[1]
b = list(set(map(int,input().split())))
b.sort()
n = len(b)
ql(1,n,k)

