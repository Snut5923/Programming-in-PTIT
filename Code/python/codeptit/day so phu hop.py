def check(a,b,n):
    a.sort()
    b.sort()
    for i in range(n):
        if a[i] > b[i]:
            return False
    return True
tc = int(input())
for _ in range(tc):
    n = int(input())
    a = list(map(int,input().split()))
    b = list(map(int, input().split()))
    if check(a,b,n): print("YES")
    else: print("NO")