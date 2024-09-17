from math import *
a = list(map(int,input().split()))
n = a[0]
k = a[1]
dem = 0
for i in range(10**(k-1),10**k,1):
    if gcd(i,n)==1:
        print(i,end=' ')
        dem+=1
        if(dem%10==0): print()

