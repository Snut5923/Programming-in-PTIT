def thn(n,a,c,b):
    if n==0:
        return
    thn(n-1,a,b,c)
    print(a+" -> "+c)
    thn(n-1,b,c,a)
n = int(input())
thn(n,'A','C','B')