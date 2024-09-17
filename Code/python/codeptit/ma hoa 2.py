p = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_."
d = {p[i]: i for i in range(len(p))}
p = list(p)
while 1:
    c = input()
    if c=="0": break
    a = list(map(str,c.split()))
    k = int(a[0])
    s = a[1]
    b =''
    for i in range(len(s)):
        b = p[(d[s[i]]+k)%28] + b
    print(b)