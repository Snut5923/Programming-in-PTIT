from math import *
def gt(n):
    if(n==1 or n==0): return 1
    else: return n*gt(n-1)
def tong(n):
    a = 0
    for i in n:
        a += gt(int(i))
    return a
tc = int(input())
for _ in range(tc):
    n = input()
    if int(n) == tong(n):
        print("Yes")
    else: print("No")