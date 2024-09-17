if __name__ == '__main__':
    tc = int(input())
    for _ in range(tc):
        kq=0
        n = int(input())
        a=list(map(int,input().split()))
        a.sort()
        for i in range(n):
            l=i+1
            r=n-1
            while l<r:
                if(a[i]+a[l]+a[r]==0):
                    kq+=1
                    l+=1
                elif a[i]+a[l]+a[r]<0:
                    l+=1
                else:r-=1
        print(kq)