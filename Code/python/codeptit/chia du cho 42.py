a = []
while len(a) < 10:
    a += list(map(int,input().split()))
b = []
for i in a:
    b.append(i%42)
b = list(set(b))
print(len(b))