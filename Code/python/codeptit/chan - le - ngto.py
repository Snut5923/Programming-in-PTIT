from math import *
def nt(n):
    for i in range(2,int(sqrt(n))+1):
        if n%i == 0:
            return False
    return n>1
def check(s):
    x = 0
    for i in range(len(s)):
        x += int(s[i])
        if (i%2==0 and int(s[i])%2==0) or (i%2==1 and int(s[i])%2==1):
            continue
        else:
            return False
    if nt(x):
        return True
    return False
n = int(input())
for _ in range(n):
    if check(input()):
        print("YES")
    else:
        print("NO")