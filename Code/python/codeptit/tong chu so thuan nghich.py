def tong(s):
    x = 0
    for i in s:
        x += int(i)
    return str(x)
n = int(input())
for _ in range(n):
    s = input()
    if tong(s) == tong(s)[::-1] and len(tong(s)) > 1: print("YES")
    else: print("NO")