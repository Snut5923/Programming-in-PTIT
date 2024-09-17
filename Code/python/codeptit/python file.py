
def check(s):
    for i in s:
        if i.isdigit() or i.isalpha() or i == '.' or i == '_':
            continue
        else:return False
    a = s.count('.')
    if a!=1: return False
    if s[-3:] == '.py':
        return True
if check(input()):print("yes")
else: print("no")