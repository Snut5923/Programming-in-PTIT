from math import *
for z in range(int(input())):
    n = int(input())
    a = list(map(int, input().split()))
    a.sort()
    mp ={}
    res = 0
    for i in a:
        if i not in mp:
            mp[i] = 1
        else:
            mp[i] += 1
        res = max(res,mp[i])
    ok = 0
    for i in mp:
        if mp[i] > n//2:
            ok+=1
            print(i)
            break
    if ok==0: print("NO")
