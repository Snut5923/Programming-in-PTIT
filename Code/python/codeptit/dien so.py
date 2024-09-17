from math import *
def xuli(a):
    b = set(a)
    a.sort()
    n = a[-1] - a[0] + 1
    m = len(b)
    return n - m
for _ in range(int(input())):
    _ = input()
    a = list(map(int,input().split()))
    print(xuli(a))