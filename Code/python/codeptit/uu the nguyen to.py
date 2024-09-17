from math import *
def nt(n):
    for i in range(2,int(sqrt(n))+1):
        if n%i==0: return False
    return True
def check(s):
    if nt(len(s)) == False: return False
    a = 0
    for i in s:
        if nt(int(i)):
            a+=1
    b = len(s) - a
    if a > b: return True
    return False
n =int(input())
for _ in range(n):
    if check(input()): print("YES")
    else: print("NO")