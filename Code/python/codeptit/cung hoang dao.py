def cung(d,m):
    if m==1:
        if(d>=1 and d<=19): return "Ma Ket"
        else: return "Bao Binh"
    elif m==2:
        if(d>=1 and d<=18): return "Bao Binh"
        else: return "Song Ngu"
    elif m==3:
        if(d>=1 and d<=20): return "Song Ngu"
        else: return "Bach Duong"
    elif m==4:
        if(d>=1 and d<=19): return "Bach Duong"
        else: return "Kim Nguu"
    elif m==5:
        if(d>=1 and d<=20): return "Kim Nguu"
        else: return "Song Tu"
    elif m==6:
        if(d>=1 and d<=20): return "Song Tu"
        else: return "Cu Giai"
    elif m==7:
        if(d>=1 and d<=22): return "Cu Giai"
        else: return "Su Tu"
    elif m==8:
        if(d>=1 and d<=22): return "Su Tu"
        else: return "Xu Nu"
    elif m==9:
        if(d>=1 and d<=22): return "Xu Nu"
        else: return "Thien Binh"
    elif m==10:
        if(d>=1 and d<=22): return "Thien Binh"
        else: return "Thien Yet"
    elif m==11:
        if(d>=1 and d<=22): return "Thien Yet"
        else: return "Nhan Ma"
    elif m==12:
        if(d>=1 and d<=21): return "Nhan Ma"
        else: return "Ma Ket"
tc = int(input())
for _ in range(tc):
    a = list(map(int,input().split()))
    print(cung(a[0],a[1]))