#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int a[n];
        ll dp[n];
        for(int i=0;i<n;i++){
            cin >> a[i];
            dp[i] = 1ll * a[i];
        }
        ll res = dp[0];
        for(int i=1;i<n;i++){
            dp[i] = max(dp[i],dp[i-1] + a[i]);
            res = max(res,dp[i]);
        }
        cout << res << endl;
    }
}