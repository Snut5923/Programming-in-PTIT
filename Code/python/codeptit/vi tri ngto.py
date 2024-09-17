from math import *
def ok(a):
    if a == '2' or a == '3' or a == '5' or a == '7':
        return True
    return False
def nt(n):
    for i in range(2,int(sqrt(n))+1):
        if n%i==0: return False
    return n>1
def check(s):
    for i in range(len(s)):
        if (nt(i) and nt(int(s[i]))) or (nt(i)==False and nt(int(s[i]))==False):
            continue
        else:
            return False
    return True
n = int(input())
for _ in range(n):
    if check(input()):
        print("YES")
    else: print("NO")