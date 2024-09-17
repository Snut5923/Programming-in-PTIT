F = [1] * 94
for i in range(3,94):
    F[i] = F[i-1] + F[i-2]
n = int(input())
for _ in range(n):
    a = list(map(int,input().split()))
    for i in range(a[0],a[1]+1):
        print(F[i],end=' ')
    print()