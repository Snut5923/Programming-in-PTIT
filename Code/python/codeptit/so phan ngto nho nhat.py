from math import *
def dem(n):
    a = []
    x = 1
    for i in range(2,n+1):
        dem = 0
        while n%i == 0:
            dem += 1
            n //= i
        x *= (dem+1)
    return x

def xuli(n):
    res = 0
    for i in range(n+1):
        res = max(res,dem(i))
    x = n+1
    while 1:
        if dem(x) > res:
            print(x)
            break
        x+=1
    return
n = int(input())
for _ in range(n):
    xuli(int(input()))