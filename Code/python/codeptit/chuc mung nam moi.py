n = int(input())
a = []
for _ in range(n):
    s = input()
    a.append(s)
a = list(set(a))
print(len(a))