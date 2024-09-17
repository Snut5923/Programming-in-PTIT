n = int(input())
res = 1
a = list(map(int,input().split()))
a.sort()
for i in a:
    if i == res:
        res += 1
    elif i > res:
        break
print(res)