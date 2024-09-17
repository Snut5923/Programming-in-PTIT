from math import *
def check(s):
    n = int(s)
    for i in range(2,int(sqrt(n))+1):
        if n%i==0:
            return False
    return n>1
n = int(input())
for _ in range(n):
    s = input()
    if check(s[-4:]): print("YES")
    else: print("NO")