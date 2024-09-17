def xuli(s):

    a = 0
    b = 0
    for i in s:
        if(i.islower()): a+=1
        else: b+=1
    if(a>=b): return s.lower()
    return s.upper()
print(xuli(input()))