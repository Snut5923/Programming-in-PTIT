def kq(n):
    if n==1: return 1
    if n==2: return 1/2
    return 1/n + kq(n-2)
def xuli(n):
    x = 0
    for i in range(n,0,-2):
        x += 1/i
    return x
n = int(input())
while n>0:
    a = int(input())
    print('%.6f' % xuli(a))
    n -= 1