from math import *
a = []
n = int(input())
for _ in range(n):
    a.append(list(map(int,input().split())))
k = int(input())
x = 0
y = 0
for i in range(n):
    for j in range(i+1,n):
        if i!=j:
            x += a[i][j]
            y += a[j][i]
if abs(x-y) <= k: print("YES")
else: print("NO")
print(abs(x-y))