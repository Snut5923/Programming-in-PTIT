from math import *
for _ in range(int(input())):
    tmp = list(map(int,input().split()))
    n = tmp[0]
    m = tmp[1]
    x = []
    h = []
    for _ in range(n):
        x.append(list(map(int,input().split())))
    for _ in range(3):
        h.append(list(map(int,input().split())))
    res = 0
    for i in range(n):
        if i==n-2: break
        for j in range(m):
            if j==m-2: break
            for u in range(3):
                for v in range(3):
                    res += h[u][v]*x[i+u][j+v]
    print(res)

