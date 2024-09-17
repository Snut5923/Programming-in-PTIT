class mua:
    def __init__(self,x,y,m):
        a = list(map(int,x.split(':')))
        b = list(map(int,y.split(':')))
        self.m = m
        self.t = b[0] + b[1]/60 - a[0] - a[1]/60
    def update(self,x,y,z):
        a = list(map(int, x.split(':')))
        b = list(map(int, y.split(':')))
        self.t = b[0] + b[1]/60 - a[0] - a[1]/60 + self.t
        self.m = z + self.m
mp = {}
for _ in range(int(input())):
    ten = input()
    begin = input()
    end = input()
    m = int(input())
    if ten not in mp:
        a = mua(begin,end,m)
        mp[ten] = a
    else:
        mp[ten].update(begin,end,m)
i = 1
for x in mp:
    print('T{:02}'.format(i),end=' ')
    print(x,'%.2f' %(mp[x].m/mp[x].t),sep=' ',end='\n')
    i+=1