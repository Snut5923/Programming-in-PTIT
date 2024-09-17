class hoadon:
    def __init__(self, ma, ten, sl, gia, ck) -> None:
        self.ma = ma
        self.ten = ten
        self.sl = sl
        self.gia = gia
        self.ck = ck
        self.tong = sl*gia - ck
    def __str__(self) -> str:
        return self.ma + ' ' + self.ten + ' ' + str(self.sl) + ' ' + str(self.gia) + ' ' + str(self.ck) + ' ' + str(self.tong)
    def __lt__(self, other):
        return self.tong > other.tong
a = []
for i in range(int(input())): a.append(hoadon(input(), input(), int(input()), int(input()), int(input())))
a.sort()
for i in a:
    print(i)