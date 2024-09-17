def tn(s):
    l = 0
    r = len(s)-1
    a = list(s)
    while(l<r):
        if a[l] != a[r]: return False
        l+=1
        r-=1
    return True
dict = {}
res = 0
a = open("VANBAN.in","r")
for i in a:
    x = i.split()
    for i in x:
        if tn(i):
            if i not in dict:
                dict[i] = 1
                res = max(res, len(i))
            else:
                dict[i] += 1
for i in dict:
    if len(i) == res:
        print(i,dict[i],sep=' ',end='\n')
