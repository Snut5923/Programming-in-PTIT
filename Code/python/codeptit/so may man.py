def check(s):
    dem=0
    for i in s:
        if i=='4' or i=='7': dem+=1
    if dem==4 or dem==7: return "YES"
    return "NO"
s = input()
print(check(s))