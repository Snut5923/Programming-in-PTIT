from math import *
def nt(n):
    for i in range(2,int(sqrt(n))+1):
        if n%i==0: return False
    return n>1
n = int(input())
a = list(map(int,input().split()))
mp = {}
for i in a:
    if nt(i):
        if i not in mp:
            mp[i] = 1
        else:
            mp[i] += 1
for i in mp:
    print(i,mp[i],sep=' ',end='\n')
