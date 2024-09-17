def xuli(s,n,a,b,c):
    if len(s)==n and a>0 and b>=a and c>=b:
        print(s)
    if len(s) < n:
        xuli(s+'A',n,a+1,b,c)
        xuli(s+'B',n,a,b+1,c)
        xuli(s+'C',n,a,b,c+1)
n = int(input())
for i in range(3,n+1):
    xuli('',i,0,0,0)