def check(s):
    for i in range(0,len(s)-1,1):
        if int(s[i]) > int(s[i+1]): return "NO"
    return "YES"
n = int(input())
for _ in range(n):
    print(check(input()))
