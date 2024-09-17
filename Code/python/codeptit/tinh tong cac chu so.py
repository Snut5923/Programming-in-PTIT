for _ in range(int(input())):
    s = input()
    chu = []
    so = 0
    for i in s:
        if i.isdigit():
            so += int(i)
        else:
            chu.append(i)
    chu.sort()
    for i in chu:
        print(i,end='')
    print(so,end='\n')