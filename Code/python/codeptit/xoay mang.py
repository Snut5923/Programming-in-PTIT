if __name__ == '__main__':
    tc = int(input())
    for _ in range(tc):
        a = list(map(int,input().split()))
        n = a[0]
        d = a[1]
        b = list(map(int,input().split()))
        b = b[d:]+b[:d]
        for i in b:
            print(i,end=' ')
        print()