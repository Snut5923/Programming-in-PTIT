def check(s,n):
    x = 0
    i = 0
    while i < len(s):
        if i > len(s)-len(n):
            break
        else:
            if s[i:i+len(n)] == n:
                x+=1
                i+=len(n)
            else:
                i+=1
    print(x)
    return
n = int(input())
for _ in range(n):
    s = input()
    n = input()
    check(s,n)