from math import *
n = int(input())
for _ in range(n):
    a = list(map(float,input().split()))
    print(ceil(log(a[2]/a[0],1 + a[1]/100)))