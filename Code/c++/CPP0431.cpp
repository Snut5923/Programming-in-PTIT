#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,k;
        cin >> n >> k;
        int a[n];
        for(int i=0;i<n;i++) cin >> a[i];
        sort(a,a+n);
        long long res = 0;
        for(int i=0;i<n-1;i++){
            int idx = lower_bound(a+i+1,a+n,a[i]+k) - a;
            res += idx - (i+1);
        }
        cout << res << endl;
    }
}