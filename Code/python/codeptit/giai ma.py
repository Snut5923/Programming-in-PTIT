def xuli(s):
    a = ''
    for i in range(0,len(s),2):
        a += s[i] * int(s[i+1])
    return a
n = int(input())
for _ in range(n):
    print(xuli(input()))