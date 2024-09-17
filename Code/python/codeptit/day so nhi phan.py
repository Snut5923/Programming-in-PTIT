n = int(input())
a = list(map(int,input().split()))
dem = 0
for i in range(0,n-1):
    if a[i:i+2] == [0,1] or a[i:i+2] == [1,0]:
        dem += 1
print(dem)