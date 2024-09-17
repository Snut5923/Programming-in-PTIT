from math import *
def check(l,r):
    for i in range (l,r-2):
        for j in range(i+1,r):
            for k in range(j+1,r+1):
                if gcd(i,j) == gcd (j,k) and gcd(j,k) == gcd(k,i) and gcd(i,j)==1:
                    print("(",end='')
                    print(i,j,k,sep=', ',end=')\n')
    return
a = list(map(int,input().split()))
check(a[0],a[1])