from math import *
import array
M = 7919
N = 7920
#sangngto
a = array.array('i',[1] * N)
b = []
for i in range(2,int(sqrt(M))+1):
    if a[i] == 1:
        for j in range(i,M//i +1):
            a[i*j] = 0
for i in range(2,N):
    if a[i] == 1:
        b.append(i)
c = list(map(int,input().split()))
n = c[0]
x = c[1]
print(x,end=' ')
y = x
for i in range(n):
    print(y+b[i],end=' ')
    y += b[i]
