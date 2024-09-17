def check(s):
    a = s[::2]
    b = s[1::2]
    if int(a) % int('1'*len(a)) == 0 and int(b) % int('1'*len(b)) == 0:
        print("YES")
    else:
        print("NO")
    return
n = int(input())
for _ in range(n):
    check(input())