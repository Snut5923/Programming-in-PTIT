def check(s):
    for i in s:
        if i!='0' and i!='2' and i!='4' and i!='6' and i!='8':
            return False
    return True
x = 2
a = []
while x<=888:
    s = str(x)
    if check(s): a.append(int(s+s[::-1]))
    x += 2
n = int(input())
for _ in range(n):
    x = int(input())
    for i in a:
        if i < x:
            print(i,end=' ')
        else:
            break
    print()