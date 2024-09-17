def xuli(n):
    print("1 ",end='')
    for i in range(2,n+1,1):
        dem = 0
        while n % i == 0:
            dem += 1
            n //= i
        if dem > 0:
            print(f"* {i}^{dem} ",end = '')
    print()
    return
n = int(input())
for _ in range(n):
    xuli(int(input()))
