
def check(a):
    if(len(a)!=4): return False
    for i in a:
        if i<0 or i >255:
            return False
    return True
n = int(input())
for _ in range(n):
    try:
        a = list(map(int,input().split('.')))
        if check(a): print("YES")
        else: print("NO")
    except: print("NO")