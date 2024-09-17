import string
from math import *
class kh:
    def __init__(self,mamh,tenmh,sl,dongia,ck):
        self.mamh = mamh
        self.tenmh = tenmh
        self.sl = int(sl)
        self.dongia = int(dongia)
        self.ck = int(ck)
        self.tien = self.dongia*self.sl - self.ck
    def __gt__(self, other):
        return self.tien < other.tien
    def __str__(self)->str:
        return self.mamh + " "+ self.tenmh +" "+str(self.sl) + " " + str(self.dongia) +" "+str(self.ck)+" "+str(self.tien)
kq = []
t = int(input())
for _ in range(t):
    a = kh(input(),input(),input(),input(),input())
    kq.append(a)
kq.sort()
for i in kq:
    print(i)