#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,k;
        cin >> n >> k;
        int a[n];
        int d = 0;
        for(int i=0;i<n;i++){
            cin >> a[i];
            if(a[i] <= k) d++;
        }
        int dem = 0;
        for(int i=0;i<d;i++){
            if(a[i] <= k) dem++;
        }
        int res = d-dem;
        for(int i=d;i<n;i++){
            if(a[i-d] <= k) dem--;
            if(a[i] <=k) dem++;
            res = min(res,d-dem);
        }
        cout << res << endl;
    }
}
