def check(s):
    a = ''
    x = 1
    l = len(s)
    for i in range(0,l-1):
        if(s[i] == s[i+1]):
            x += 1
        else:
            a += str(x) + s[i]
            x = 1
    a += str(x) + s[l-1]
    return a
n = int(input())
for _ in range(n):
    print(check(str(input())))
