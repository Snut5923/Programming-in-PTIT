def check(s):
    for i in s:
        if int(i)%2==1:
            return False
    return True
if __name__ == '__main__':
    n = int(input())
    for _ in range(n):
        s = int(input())
        for i in range (10,s,1):
            a = str(i)
            x = len(a)
            if a==a[::-1] and check(a) and len(a)%2==0: print(a,end=' ')
        print()