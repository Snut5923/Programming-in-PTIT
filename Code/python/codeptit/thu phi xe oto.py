def tien(xe,ghe):
    if xe == 'Xe_con':
        if ghe == 5: return 10000
        else: return 15000
    elif xe =='Xe_tai': return 20000
    else:
        if ghe==29: return 50000
        return 70000
mp = {}
for _ in range(int(input())):
    a = input().split()
    ngay = a[-1]
    xe = a[1]
    ghe = int(a[2])
    if a[3] == 'IN':
        if ngay not in mp:
            mp[ngay] = tien(xe,ghe)
        else: mp[ngay] += tien(xe,ghe)
for i in mp:
    print(i,mp[i],sep=': ',end='\n')
