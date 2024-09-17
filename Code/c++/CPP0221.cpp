#include<bits/stdc++.h>
using namespace std;
void xuli(int n,int m){
    int a[n][m],b[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++) cin >> a[i][j];
    }
    int l,r,t,u;
    l = 0;
    r = m - 1;
    t = 0;
    u = n - 1;
    while(l<r && t<u){
        for(int i=l;i<=r;i++){
            if(i==r) b[t+1][i] = a[t][i];
            else b[t][i+1] = a[t][i];
        }
        for(int i=t+1;i<=u;i++){
            if(i==u) b[i][r-1] = a[i][r];
            else b[i+1][r] = a[i][r];
        }
        for(int i=r-1;i>=l;i--){
            if(i==l) b[u-1][i] = a[u][i];
            else b[u][i-1] = a[u][i];
        }   
        for(int i=u-1;i>=t+1;i--){
            b[i-1][l] = a[i][l];
        }
        l++;
        r--;
        t++;
        u--;
        if(l==r && t==u) b[l][t] = a[l][t];
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++) cout << b[i][j] << " ";
        
    }
    cout << endl;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,m;
        cin >> n >> m;
        xuli(n,m);
    }
}