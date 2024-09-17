from math import *
def nt(n):
    for i in range(2,int(sqrt(n))+1,1):
        if n%i==0: return False
    return n>1
def dem(n):
    a = 0
    for i in range(n):
        if gcd(i,n)==1: a+=1
    if nt(a): return "YES"
    return "NO"
tc = int(input())
for _ in range(tc):
    n = int(input())
    print(dem(n))