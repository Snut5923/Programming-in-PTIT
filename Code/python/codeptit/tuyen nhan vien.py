from decimal import Decimal
class nv:
    def __init__(self,ten,lt,th,i):
        self.ma = 'TS0'+str(i)
        self.ten = ten
        self.tb = (lt+th)/2
        x = self.tb
        if x < 5: self.s = "TRUOT"
        elif x < 8: self.s = "CAN NHAC"
        elif x < 9.5: self.s = "DAT"
        else: self.s = "XUAT SAC"
    def __lt__(self, other):
        if self.tb != other.tb:
            return self.tb > other.tb
kq = []
t = int(input())
for i in range(1,t+1):
    ten = input()
    lt = float(input())
    th = float(input())
    if lt>10:
        lt /= 10
    if th>10:
        th /= 10
    a = nv(ten,lt,th,i)
    kq.append(a)
kq.sort()
for i in kq:
    print(i.ma,i.ten,'%.2f'%(i.tb),i.s,sep=' ',end='\n')


