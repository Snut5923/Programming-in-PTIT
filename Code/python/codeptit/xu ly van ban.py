a = []
while True:
    try:
        a += input().split()
    except Exception:
        break
for i in range(len(a)):
    a[i] = a[i].lower()
def check(s):
    if len(s) > 0:
        for i in s:
            if i.isalnum():
                return True;
    return False
s = ''
for i in a:
    if i[-1] not in '.?!':
        s += i + ' '
    else:
        if i[-1] == '.': tmp = i.split('.')
        elif i[-1] == '?': tmp = i.split('?')
        else: tmp = i.split('!')
        s += tmp[0]
        if check(s):
            print(s[0].upper()+s[1:])
        s = ''
if check(s):
    print(s[0].upper()+s[1:])
