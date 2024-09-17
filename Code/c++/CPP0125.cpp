#include<bits/stdc++.h>
using namespace std;
void xuli(int a,int b){
    int nt[b+1] = {};
    nt[0] = 1;
    nt[1] = 1;
    for (int i=2;i*i<=b;i++){
        if(nt[i]==0){
            for(int j=i*i;j<=b;j+=i){
                nt[j] = 1;
            }
        }
    }
    for(int i=a;i<=b;i++){
        if (nt[i]==0){
            cout << i << " ";
        }
    }
}
int main(){
    int a,b;
    cin >> a >> b;
    if (a>b){
        int x = a;
        a = b;
        b = x;
    }
    xuli(a,b);
    return 0;
}