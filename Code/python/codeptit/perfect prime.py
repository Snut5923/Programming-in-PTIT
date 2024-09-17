from math import *
def nt(n):
    for i in range(2,int(sqrt(n))+1,1):
        if n%i==0: return False
    return n>1
def tong(n):
    a = 0
    for i in n:
        a += int(i)
    return a
def chuso(n):
    for i in n:
        if nt(int(i))==False: return False
    return True
tc = int(input())
for _ in range(tc):
    n = input()
    if nt(int(n)) and nt(int(n[::-1])) and chuso(n) and nt(tong(n)):
        print("Yes")
    else: print("No")