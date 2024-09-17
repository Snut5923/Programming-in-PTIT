from math import *
def check(s):
    s1 = s
    s2 = s[::-1]
    for i in range(len(s)):
        if abs(ord(s1[i]) - ord(s1[i-1])) != abs(ord(s2[i]) - ord(s2[i-1])):
            return "NO"
    return "YES"
n = int(input())
for _ in range(n):
    print(check(input()))