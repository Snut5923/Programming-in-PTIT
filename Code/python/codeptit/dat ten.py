a = [0]*20
n,k = list(map(int,input().split()))
b = list(input().split())
b = sorted(list(set(b)))
n = len(b)
kq = []
def Try(i):
    for j in range(a[i-1]+1,n-k+i+1):
        a[i] = j
        if i==k:
            s = ''
            for i in range(1,k+1):
                s += b[a[i]-1]+' '
            kq.append(s)
        else:
            Try(i+1)
Try(1)
kq.sort()
for i in kq:
    print(i)