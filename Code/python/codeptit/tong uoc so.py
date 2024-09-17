from math import *
import sys
import array
M = 2*10**6
N = M + 1
mark = array.array('i',[0] * N)
for i in range(2,int(sqrt(M))+1):
    if mark[i] == 0:
        mark[i] = i
        for j in range(i,M//i+1):
            mark[i*j] = i
del j
del M
for i in range(4,N):
    mark[i] += mark[i//mark[i]] if mark[i] else i

del N
del i
tong = 0
n = int(sys.stdin.readline())
while 1:
    try:
        x = int(sys.stdin.readline())
        tong += mark[x]
    except: break
print(tong)