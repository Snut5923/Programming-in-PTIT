def dem(s):
    a = list(s.split())
    if len(a)==6 or len(a)==8:
        return 1
    else: return 2
kq = []
d = 0
i = 0
for _ in range(int(input())):
    s = input()
    if i==0:
        kq.append(dem(s))
    else:
        if dem(s) == 2:
            d += 1
        if dem(s) != kq[-1]:
            if d==4: d=0
            kq.append(dem(s))
        else:
            if d==5:
                d = 1
                kq.append(dem(s))
    i+=1

print(len(kq))
for i in kq:
    print(i)