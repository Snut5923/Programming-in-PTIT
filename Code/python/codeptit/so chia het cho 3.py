def tong(s):
    x = 0
    for i in s:
        x += int(i)
    return x
n = int(input())
for _ in range(n):
    if tong(input()) % 3 ==0:
        print("YES")
    else: print("NO")