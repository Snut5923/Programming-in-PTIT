from math import *
def tong(s):
    x = 0
    for i in s:
        x += int(i)
    return x
def check(n):
    for i in range(2,int(sqrt(n))+1):
        if n%i==0: return False
    return n>1
n = int(input())
for _ in range(n):
    if check(tong(input())): print("YES")
    else: print("NO")