x = list(map(int,input().split()))
a = x[0]
k = x[1]
n = x[2]
b = k - a%k
ok = 0
while  b <= n-a:
    ok +=1
    print(b,end=' ')
    b += k
if ok == 0: print('-1')