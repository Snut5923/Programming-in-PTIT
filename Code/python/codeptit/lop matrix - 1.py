
class matrix:
    def __init__(self,n,m,a):
        self.n = n
        self.m = m
        self.a = a
    def xuli(self):
        b = []
        for i in range(self.m):
            x = []
            for j in range(self.n):
                x.append(self.a[j][i])
            b += [x]
        for i in range(self.n):
            for j in range(self.n):
                x = 0
                for k in range(self.m):
                    x += self.a[i][k] * b[k][j]
                print(x, end=' ')
            print()
for _ in range(int(input())):
    n,m = [int(x) for x in input().split()]
    a = []
    for i in range(n):
        a += [list(map(int, input().split()))]
    m = matrix(n,m,a)
    m.xuli()