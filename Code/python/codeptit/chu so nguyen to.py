from math import *
def prime(n):
    for i in range(2,int(sqrt(n))+1):
        if n%i==0: return False
    return n>1
def check(s):
    if prime(len(s)) == False: return False
    nt = 0
    knt = 0
    for i in s:
        if i=='2' or i=='3' or i=='5' or i=='7':
            nt +=1
        else: knt+=1
    if nt > knt: return True
    return False
n = int(input())
for _ in range(n):
    if check(input()): print("YES")
    else: print("NO")