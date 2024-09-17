def xuli(s):
    if len(s) < 3: return False
    ok = 0
    for i in range(1,len(s)-1):
        a = 0
        b = 0
        for j in range(i):
            if int(s[j]) - int(s[j+1]) >= 0:
                a += 1
                break
        for j in range(i,len(s)-1):
            if int(s[j]) - int(s[j+1]) <= 0:
                b += 1
                break
        if a==0 and b==0:
            ok += 1
            return True
    if ok == 0: return False

n = int(input())
for _ in range(n):
    if xuli(input()): print("YES")
    else: print("NO")








