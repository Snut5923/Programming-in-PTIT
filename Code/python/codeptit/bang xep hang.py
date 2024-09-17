class hs:
    def __init__(self,ten,true,sub):
        self.ten = ten
        self.true = true
        self.sub = sub
    def __lt__(self,other):
        if self.true != other.true:
            return self.true > other.true
        elif self.sub != other.sub:
            return self.sub < other.sub
        return self.ten < other.ten
kq = []
n = int(input())
for _ in range(n):
    ten = input()
    a = list(map(int,input().split()))
    true = a[0]
    sub = a[1]
    kq.append(hs(ten,true,sub))
kq.sort()
for i in kq:
    print(i.ten,i.true,i.sub,sep=' ',end='\n')