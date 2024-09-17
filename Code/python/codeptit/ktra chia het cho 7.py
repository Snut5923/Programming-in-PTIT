def xuli(s):
    ok = 0
    if int(s) % 7 == 0:
        print(s)
        return
    for i in range(1001):
        a1 = int(s)
        a2 = int(s[::-1])
        if (a1+a2) % 7 == 0:
            print(a1+a2)
            ok += 1
            break
        s = str(a1+a2)
    if ok == 0: print("-1")
    return
n = int(input())
for _ in range(n):
    xuli(input())
