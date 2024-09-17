from math import *
class ps:
    def __init__(self,ts,ms):
        self.ts = ts
        self.ms = ms
    def inra(self):
        x = gcd(self.ts,self.ms)
        print(self.ts//x,self.ms//x,sep='/')
if __name__ == '__main__':
    ts,ms = map(int,input().split())
    a = ps(ts,ms)
    a.inra()
