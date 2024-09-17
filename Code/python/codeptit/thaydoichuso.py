from math import *
def sonho(n,lon,nho):
    a = n.replace(str(lon),str(nho))
    return int(a)
def sn(n,lon,nho):
    b = list(n)
    for i in range(len(b)):
        if(int(n[i])==lon):
            b[i] = str(nho)
    c = ''.join(str(i) for i in b)
    return int(c)
def sl(n,lon,nho):
    b = list(n)
    for i in range(len(b)):
        if (int(n[i]) == nho):
            b[i] = str(lon)
    c = ''.join(str(i) for i in b)
    return int(c)
def solon(n,lon,nho):
    a = n.replace(str(nho),str(lon))
    return int(a)
if __name__ == '__main__':
    n = int(input())
    for _ in range(n):
        a = map(int,input().split())
        b = list(a)
        lon = max(b[0],b[1])
        nho = min(b[0],b[1])
        c = list(map(str,input().split()))
        if(len(c)==2):
            x = c[0]
            y = c[1]
        else:
            x = c[0]
            y = input()
        print(sonho(x,lon,nho)+sonho(y,lon,nho),solon(x,lon,nho)+solon(y,lon,nho),sep=' ')
        
            