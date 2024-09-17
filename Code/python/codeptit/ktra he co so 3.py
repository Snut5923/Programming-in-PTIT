def check(s):
    for i in s:
        if i!='0' and i!='1' and i!='2':
            return False
    return True
n = int(input())
for _ in range(n):
    if check(input()): print("YES")
    else: print("NO")