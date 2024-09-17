from math import *
class ps:
    def __init__(self,ts,ms):
        self.ts = ts
        self.ms = ms
    def tong(self,x):
        a = self.ts * x.ms + self.ms * x.ts
        b = self.ms * x.ms
        c = gcd(a,b)
        print(a//c,b//c,sep='/')
if __name__ == '__main__':
    a,b,c,d = map(int,input().split())
    x = ps(a,b)
    y = ps(c,d)
    x.tong(y)