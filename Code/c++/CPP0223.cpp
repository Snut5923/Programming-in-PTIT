#include<bits/stdc++.h>
using namespace std;
void in(int n,int m){
    int a[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cin >> a[i][j];
        }
    }
    int l,r,t,u;
    l = 0;
    r = m - 1;
    t = 0;
    u = n - 1;
    while(l<=r && t<=u){
        for(int i=l;i<=r;i++){
            cout << a[t][i] << " ";
        }
        t++;
        for(int i=t;i<=u;i++){
            cout << a[i][r] << " ";
        }
        r--;
        if(t<=u){
            for(int i=r;i>=l;i--){
                cout << a[u][i] << " ";
            }
            u--;
        }
        if(l<=r){
            for(int i=u;i>=t;i--){
                cout << a[i][l] << " ";
            }
            l++;
        }
    }
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,m;
        cin >> n >> m;
        in(n,m);
        cout << endl;
    }
}