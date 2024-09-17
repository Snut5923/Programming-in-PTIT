def check(s):
    for i in s:
        if(i!='4' and i!='7'): return "NO"
    return "YES"
n = int(input())
for _ in range(n):
    print(check(input()))