class cathi:
    def __init__(self,i,ngay,gio,phong):
        self.ngay = ngay
        self.gio = gio
        self.phong = phong
        a = gio.split(":")
        self.h = int(a[0])
        self.m = int(a[1])
        b = ngay.split("/")
        self.d = int(b[0])
        self.m = int(b[1])
        self.y = int(b[2])
        if i < 10:
            self.ma = "C00"+str(i)
        elif i < 100:
            self.ma = "C0"+str(i)
        else: self.ma = "C"+str(i)
    def __str__(self)->str:
        return self.ma + " " + self.ngay + " " + self.gio + " " + self.phong
    def __lt__(self,other):
        if self.ngay != other.ngay:
            if self.y != other.y:
                return self.y < other.y
            elif self.m != other.m:
                return self.m < other.m
            return self.d < other.d
        elif self.gio != other.gio:
            if self.h != other.h:
                return self.h < other.h
            return self.m < other.m
        return self.ma.__lt__(other.ma)
def read_file_to_list(file_path):
    with open(file_path, 'r') as file:
        lines = [line.strip() for line in file.readlines()]
    return lines
kq = []
x = read_file_to_list("CATHI.in")
t = int(x[0])
i = 0
for j in range(t):
    kq.append(cathi(j+1,x[i+1],x[i+2],x[i+3]))
    i += 3
kq.sort()
for i in kq:
    print(i)