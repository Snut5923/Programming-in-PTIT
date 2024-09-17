#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int mod = 1e9 + 7;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,x;
        cin >> n >> x;
        int a[n];
        for(int i=0;i<n;i++){
            cin >> a[i];
        }
        ll res = a[0];
        for(int i=1;i<n;i++){
            res = (res * x + a[i]) % mod;    
        }
        cout << res << endl;
    }
}
