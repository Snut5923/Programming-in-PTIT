n = int(input())
a = []
ok = 1
for _ in range(n):
    a.append(input())
s = ''
mp = {}
for i in a:
    if ok == 1:
        s = i
        mp[s] = 0
        ok = 0
    else:
        if i != '':
            mp[s]+=1
        else:
            ok = 1
for i in mp:
    print(i,mp[i],sep=': ',end='\n')