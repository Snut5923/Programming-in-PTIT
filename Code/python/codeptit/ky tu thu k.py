d=['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
def check(n,k):
    l = 2**n - 1
    m = l//2+ 1
    if k == m: return d[n-1]
    if k < m: return check(n-1,k)
    return check(n-1,k-m)
for _ in range(int(input())):
    n,k = list(map(int,input().split()))
    print(check(n,k))