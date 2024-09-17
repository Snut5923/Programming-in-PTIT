for _ in range(int(input())):
    n = int(input())
    a = list(map(int,input().split()))
    dp = [1]*(n+1)
    print('1',end=' ')
    for i in range(1,n):
        j = i-1
        while a[j] <= a[i]:
            dp[i] = max(dp[i],dp[j] + i - j)
            if j>= dp[j]: j -= dp[j]
            else: break
        print(dp[i],end=' ')
    print()
