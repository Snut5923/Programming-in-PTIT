from decimal import Decimal
class hs:
    def __init__(self,ten,a,i):
        self.ma = 'HS'+'{:02d}'.format(i)
        self.ten = ten
        self.a = a
        tong = Decimal('0')
        for i in range(10):
            if i==0 or i==1:
                tong = Decimal(a[i])*Decimal('2') + tong
            else:
                tong = Decimal(a[i]) + tong
        self.tb = tong/Decimal('12')
    def status(self):
        x = self.tb
        if x >=9: return "XUAT SAC"
        elif x>=8: return "GIOI"
        elif x>=7: return "KHA"
        elif x>=5: return "TB"
        return "YEU"
    def __lt__(self, x):
        if self.tb != x.tb:
            return self.tb > x.tb
        return self.ma < x.ma
kq = []
t = int(input())
for i in range(1,t+1):
    ten = input()
    a = list(input().split())
    x = hs(ten,a,i)
    kq.append(x)
kq.sort()
for x in kq:
    print(x.ma,x.ten,'%.1f' %(x.tb),x.status(),sep=' ',end='\n')
