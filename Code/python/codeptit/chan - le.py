from math import *
def check(s):
    tong = 0
    for i in range(len(s)):
        tong += int(s[i])
        if i<len(s)-1 and abs(int(s[i])-int(s[i+1]))!=2:
            return "NO"
    if tong%10==0: return "YES"
    return "NO"
n = int(input())
for _ in range(n):
    print(check(input()))
