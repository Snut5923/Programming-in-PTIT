def check(s):
    if(s[:2]==s[-2:]): return "YES"
    return "NO"
n = int(input())
for _ in range(n):
    print(check(input()))