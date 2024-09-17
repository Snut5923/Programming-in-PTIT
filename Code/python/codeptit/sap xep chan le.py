def xuli(n,a):
    chan =[]
    le = []
    vtc = []
    vtl = []
    for i in range(n):
        if a[i]%2==0:
            chan.append(a[i])
            vtc.append(i)
        else:
            le.append(a[i])
            vtl.append(i)
    le.sort()
    chan.sort(reverse=True)
    for i in range(n):
        if i in vtc:
            print(chan[-1],end=' ')
            chan.pop()
        else:
            print(le[-1],end=' ')
            le.pop()
    return
a = []
n = int(input())
while True:
    try: a.extend(map(int,input().split()))
    except Exception:
        break
xuli(n,a)
