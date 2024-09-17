s = input()
b =''
j = len(s)-1
dem = 0
while j>=0:
    if j>2:
        b = ',' + s[j-2:j+1] + b
        dem += 1
    else:
        b = s[:j + 1] + b
        dem += 1
    j = len(s) - dem*3 -1
print(b)