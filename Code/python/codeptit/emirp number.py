from math import *
def nguyento(n):
    for i in range(2,int(sqrt(n))+1,1):
        if(n%i==0): return False
    return n>1
tc = int(input())
for _ in range(tc):
    n = input()
    for i in range(11,int(n)+1,1):
        a = str(i)
        b = a[::-1]
        if a!=b and nguyento(int(a)) and nguyento(int(b)) and int(a) < int(b) and int(b)<int(n):
            print(a,b,end=' ')
    print()