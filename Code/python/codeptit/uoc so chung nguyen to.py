from math import *
def ucln(a,b):
    while b:
        a,b = b,a%b
    return a
def nt(n):
    for i in range(2,int(sqrt(n))+1,1):
        if n%i==0: return "NO"
    if n>1: return "YES"
    return "NO"
def tong(n):
    x=0
    s = str(n)
    for i in s:
        x+=int(i)
    return x
n = int(input())
for _ in range(n):
    a = list(map(int,input().split()))
    print(nt(tong(gcd(a[0],a[1]))))