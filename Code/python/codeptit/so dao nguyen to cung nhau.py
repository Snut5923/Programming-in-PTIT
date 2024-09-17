from math import *
def check(s):
    a1 = int(s)
    a2 = int(s[::-1])
    if gcd(a1,a2)==1: return "YES"
    return "NO"
n = int(input())
for _ in range(n):
    print(check(input()))