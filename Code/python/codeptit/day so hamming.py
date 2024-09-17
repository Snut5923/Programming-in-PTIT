from math import *
hm = set()
N = 10**18
for i in range(60):
     i2 = 2**i
     if i2 > N: break
     for j in range(38):
         i3 = 3**j
         if i2*i3 > N: break
         for k in range(26):
             i5 = 5**k
             if i2*i3*i5 > N:break
             hm.add(i2*i3*i5)
hm = sorted(hm)
def search(x,l,r):
    if l > r: return "Not in sequence"
    m = (l+r)//2
    if hm[m] == x: return m+1
    if hm[m] < x : return search(x,m+1,r)
    return search(x,l,m-1)

n = int(input())
for _ in range(n):
    x = int(input())
    print(search(x,0,len(hm)-1))
