n = int(input())
a = list(map(float,input().split()))
a.sort()
x = a[0]
y = a[-1]
tong = 0
dem = 0
for i in a:
    if i.__eq__(x) or i.__eq__(y):
        continue
    else:
        tong += i
        dem += 1
print('%.2f' %(tong/dem))