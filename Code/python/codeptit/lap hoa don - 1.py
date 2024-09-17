from decimal import Decimal
from math import *
class hd:
    def __init__(self,ten,cu,moi,i):
        self.ma = 'KH' + '{:02d}'.format(i)
        self.ten = ten
        x = moi - cu
        if x > 100:
            self.gia = (50*100 + 50*150 + (x-100)*200)*105/100
        elif x > 50:
            self.gia = (50*100 + (x-50)*150)*103/100
        else: self.gia = x*100*102/100
    def __lt__(self, other):
        return self.gia > other.gia
kq = []
t = int(input())
for i in range(1,t+1):
    a = hd(input(),int(input()),int(input()),i)
    kq.append(a)
kq.sort()
for i in kq:
    print(i.ma,i.ten,'%.0f'%(i.gia),sep=' ',end='\n')