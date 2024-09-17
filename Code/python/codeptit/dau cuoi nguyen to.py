from math import *
def nt(n):
    for i in range(2,int(sqrt(n))+1):
        if n%i==0: return False
    return n>1
def check(s):
    a = s[0:3:1]
    b = s[-3::1]
    if nt(int(a)) and nt(int(b)):
        return True
    return False
n = int(input())
for _ in range(n):
    if check(input()): print("YES")
    else: print("NO")
