#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,q;
        cin >> n >> q;
        int a[n];
        int tong[n];
        tong[0] = 0;
        int x = 0;
        for(int i=0;i<n;i++){
            cin >> a[i];
            tong[i+1] = a[i] + tong[i];
        }
        while(q--){
            int l,r;
            cin >> l >> r;
            cout << tong[r] - tong[l-1] << endl;
        }
    }
}