a = input().lower().split()
b = input().lower().split()
hop = list(set(a).union(set(b)))
hop.sort()
giao = list(set(a).intersection(set(b)))
giao.sort()
for i in hop:
    print(i,end=' ')
print()
for i in giao:
    print(i,end=' ')