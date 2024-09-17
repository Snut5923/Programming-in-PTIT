for _ in range(int(input())):
    s = input()
    a = list(map(int,input().split()))
    b = list(map(int,input().split()))
    c = list(map(int,input().split()))
    d = list(set(a).intersection(set(b)))
    e = list(set(d).intersection(set(c)))
    for i in e:
        print(i,end=' ')
    print()