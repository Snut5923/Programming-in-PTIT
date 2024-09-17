from math import *
def xuli(n):
    if n==1: return 1
    dem = 1
    while(n!=1):
        if n%2==0:
            n //= 2
        else:
            n = n*3 + 1
        dem += 1
    return dem
while 1:
    s = int(input())
    if s==0: break
    print(xuli(s))