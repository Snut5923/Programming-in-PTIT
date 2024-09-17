if __name__ == '__main__':
    tc = int(input())
    d=['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
    for _ in range(tc):
        kq=''
        a = list(map(str,input().split()))
        n = int(a[1])
        s = a[0]
        m = int(s)
        while m>0:
            a = m%n
            if a<10: kq = str(a) + kq
            else:
                kq = str(d[a-10]) + kq
            m //= n
        print(kq)
