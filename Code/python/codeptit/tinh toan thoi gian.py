class game:
    def __init__(self,ma,ten,x,y):
        self.ten = ten
        a = list(map(int,x.split(':')))
        b = list(map(int,y.split(':')))
        self.ma = ma
        tmp = b[0] + b[1]/60 - a[0] - a[1]/60
        self.gio = int(tmp)
        self.phut = (tmp - self.gio)*60
    def __lt__(self, x):
        if self.gio != x.gio:
            return self.gio > x.gio
        return self.phut > x.phut
kq = []
t = int(input())
for _ in range(t):
    ma = input()
    ten = input()
    begin = input()
    end = input()
    a = game(ma,ten,begin,end)
    kq.append(a)
kq.sort()
for i in kq:
    print(i.ma,i.ten,i.gio,'gio',int(i.phut),'phut',sep=' ',end='\n')
