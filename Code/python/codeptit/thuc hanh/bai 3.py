from math import *
class tl:
    def __init__(self,ten,ma):
        self.ten = ten
        self.ma = ma
    def getma(self):
        return self.ma
    def getten(self):
        return self.ten
class phim:
    def __init__(self,ma,matl,ngay,ten,tap):
        self.ma = ma
        self.matl = matl
        self.ngay = ngay
        self.ten = ten
        self.tap = tap
        s = self.ngay
        a = s.split('/')
        self.d = a[0]
        self.m = a[1]
        self.y = a[2]
    def put(self,s):
        self.loai = s
    def __str__(self)->str:
        return self.ma + " " + self.loai + " "+ self.ngay + " "+ self.ten + " "+self.tap
    def __lt__(self, other):
        if self.y != other.y:
            return self.y < other.y
        elif self.m != other.m:
            return self.m < other.m
        elif self.d != other.d:
            return self.d < other.d
        elif self.ten != other.ten:
            return self.ten.__lt__(other.ten)
        else: return int(self.tap) > int(other.tap)
a = list(map(int,input().split()))
b = []
for i in range(1,a[0]+1):
    if i < 10:
        ma = "TL00"+str(i)
    elif i < 100:
        ma = "TL0"+str(i)
    else: ma = "TL"+str(i)
    x = tl(input(),ma)
    b.append(x)
c = []
for i in range(1,a[1]+1):
    if i < 10:
        ma = "P00"+str(i)
    elif i < 100:
        ma = "P0"+str(i)
    else: ma = "P"+str(i)
    x = phim(ma,input(),input(),input(),input())
    for i in b:
        if x.matl == i.getma():
            x.put(i.getten())
            break
    c.append(x)
c.sort()
for i in c:
    print(i)

