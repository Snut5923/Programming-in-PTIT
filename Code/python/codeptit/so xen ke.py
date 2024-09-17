def check(s):
    if len(s)%2==0:
        return False
    if s[0] == s[1]:
        return False
    a = s[2::2]
    if int(a) % int('1'*len(a)) != 0:
        return False
    return True
n = int(input())
for _ in range(n):
    if check(input()):
        print("YES")
    else: print("NO")