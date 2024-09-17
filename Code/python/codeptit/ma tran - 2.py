from math import *
a = []
n = int(input())
for _ in range(n):
    a.append(list(map(int,input().split())))
k = int(input())
x = 0
y = 0
for i in range(n):
    for j in range(n):
        if i+j!=n-1:
            if j < n-i-1: x+= a[i][j]
            else: y+= a[i][j]

if abs(x-y) <= k: print("YES")
else: print("NO")
print(abs(x-y))