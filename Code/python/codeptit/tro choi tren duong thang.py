from math import *
tc = int(input())
for _ in range(tc):
    n = int(input())
    a=list(map(int,input().split()))
    c=list(map(int,input().split()))
    l = [0]
    res ={0 : 0}
    for i in range(n):
        for j in l:
            x = gcd(j,a[i])
            if x not in l:
                l.append(x)
                res[x] = c[i] + res[j]
            else:
                if res[x] > res[j] + c[i]:
                    res[x] = res[j] + c[i]
    if 1 not in l:
        print("-1")
    else:
        print(res[1])
