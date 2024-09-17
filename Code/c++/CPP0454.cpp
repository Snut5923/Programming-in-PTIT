#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        ll a[n];
        for(int i=0;i<n;i++){
            int x;
            cin >> x;
            a[i] = 1ll*x*x;
        }
        sort(a,a+n);
        int ok = 0;
        for(int i=0;i<n-2;i++){
            if(ok==0){
                for(int j=i+1;j<n-1;j++){
                    int idx = lower_bound(a+j+1,a+n,a[i]+a[j])-a;
                    if (a[idx] == a[i] + a[j] && idx > j && idx < n) {
                        cout << "YES" << endl;
                        ok = 1;
                        break;
                    }
                }
            }
            else break;
        }
        if(ok==0) cout << "NO" << endl;
    }
}