mod=1000000007
def pow(a,b):
    if b==1: return a
    if b&1: return pow(a,b-1)*a%mod
    p=pow(a,b>>1)
    return p*p%mod
def res(n: int, k: int):
    if k<=1: return k
    ex = 0
    while (k>>ex)^1: ex+=1
    return pow(n, ex) + res(n, k^(1<<ex))
for i in range(int(input())):
    n,k=map(int,input().split())
    print(res(n,k)%mod)