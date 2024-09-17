def xuli(a):
    dem = 0
    while a.count(a[0]) != 4:
        b = []
        for i in range(0,3):
           b.append(abs(a[i] - a[i+1]))
        b.append(abs(a[3] - a[0]))
        a = b
        dem += 1
    return dem
while 1:
    s = input()
    if s == '0 0 0 0': break
    a = list(map(int,s.split()))
    print(xuli(a))

