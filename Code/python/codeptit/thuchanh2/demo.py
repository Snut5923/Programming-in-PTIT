a, b, m = map(int, input().split())

if m > 3:
    cnt = min(b, 1) - max(a, 0) + 1
    print(cnt)
elif m == 3:
    cnt = sum(1 for i in [0, 1, 6643, 1422773, 5415589] if a <= i <= b)
    print(cnt)
elif m == 2:
    cnt = 0
    for i in range(1, 10000):
        s1 = bin(i)[2:]
        s2 = s1[::-1]
        arr = [s1 + s2, s1 + '0' + s2, s1 + '1' + s2]
        for j in arr:
            x = int(j, 2)
            if a <= x <= b:
                cnt += 1
    cnt += min(b, 1) - max(a, 0) + 1
    print(cnt)
else:
    print(0)
