from math import *
def check(s):
    if len(s) == 1 :return 0
    sum = 0
    for i in s:
        sum += ord(i) - 48
    return 1 + check(str(sum))
s = input()
if len(s) <= 1: print('1')
else: print(check(s))

