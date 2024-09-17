from math import *
def nt(n):
    for i in range(2,int(sqrt(n))+1,1):
        if n%i==0: return False
    return n>1
if __name__ == '__main__':
    tc = int(input())
    for _ in range(tc):
        n = int(input())
        kq =0
        for i in range(2,n+1,1):
            if nt(i) and ((nt(i+2) and i+2<n) or (nt(i+4) and i+4<n)) and nt(i+6) and i+6<=n:
                kq+=1
        print(kq)