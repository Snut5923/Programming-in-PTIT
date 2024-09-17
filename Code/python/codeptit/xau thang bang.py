from math import *
def check(s):
    s1 = s
    s2 = s[::-1]
    for i in range(len(s)):
        if abs(int(ord(s1[i])) - int(ord(s1[i-1]))) == abs(int(ord(s2[i])) - int(ord(s2[i-1]))):
            continue
        else:
            return False
    return True
n = int(input())
for _ in range(n):
    if check(input()): print("YES")
    else: print("NO")