from math import *
class sv:
    def __init__(self,ma,ten,lop):
        self.ma = ma
        self.ten = ten
        self.lop = lop
    def xuli(self,s):
        diem = 10
        for i in s:
            if i == 'v': diem -= 2
            elif i== 'm': diem -= 1
        if diem >= 0:self.diem = diem
        else: self.diem = 0
        if self.diem == 0: self.status = "KDDK"
        else: self.status = ""
    def __str__(self)->str:
        return self.ma+" "+self.ten+" "+self.lop+" "+str(self.diem)+" "+self.status
t = int(input())
kq = []
a = {}
for _ in range(t):
    ma = input()
    ten = input()
    lop = input()
    x = sv(ma,ten,lop)
    kq.append(x)
    a[ma] = x
for _ in range(t):
    x = list(input().split())
    a[x[0]].xuli(x[1])
for i in kq:
    print(i)

