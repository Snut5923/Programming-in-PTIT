if __name__ == '__main__':
    tc = int(input())
    d=['A','B','C','D','E','F']
    for _ in range(tc):
        kq=''
        n = int(input())
        s = input()
        if n==2: print(s)
        else:
            m = int(s,2)
            while m>0:
                a = m%n
                if a<10: kq = str(a) + kq
                else:
                    kq = str(d[a-10]) + kq
                m //= n
            print(kq)
