from math import *
kq = 0
n = int(input())
a = []
for _ in range(n):
    b = input()
    kq += comb(b.count('C'),2)
    a.append(b)
for j in range(n):
    x = 0
    for i in range(n):
        if a[i][j] == 'C':
            x += 1
    kq += comb(x,2)
print(kq)