if __name__ == '__main__':
    st=[]
    x = int(input())
    m = map(int,input().split())
    n = list(m)
    for a in n:
        if(len(st)==0):
            st.append(a)
        else:
            if((a+st[len(st)-1])%2==0): st.pop()
            else: st.append(a)
    print(len(st))