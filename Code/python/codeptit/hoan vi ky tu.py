a = [True]*10
s = input()
kq = []
def ql(i,s):
    for j in range(1,len(s)+1):
        if a[j] == True:
            kq.append(s[j-1])
            a[j] = False
            if len(kq) == len(s):
                for i in kq:
                    print(i,end='')
                print()
            else:
                ql(i+1,s)
            kq.pop()
            a[j] = True
ql(1,s)
