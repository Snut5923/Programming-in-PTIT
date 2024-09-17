def chuyen(s):
    tong = 0
    for i in range(len(s)):
        if s[i] == '1':
            tong += 2**i
    return str(tong)
s = input()
x = s[::-1]
i = 0
kq = ''
while i<len(x):
    if i<=len(x)-2:
        kq = chuyen(x[i:i+3]) + kq
    else:
        kq = chuyen(x[i::]) + kq
    i+=3
print(kq)
