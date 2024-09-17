def tich(s):
    x = 1
    for i in s:
        if i != '0':
            x *= int(i)
    return x
n = int(input())
for _ in range(n):
    print(tich(input()))