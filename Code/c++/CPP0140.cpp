#include<bits/stdc++.h>
#define faster() ios_base::sync_with_stdio(0);
using namespace std;
using ll = long long;
bool check(ll n){
    if (n > ll(1e12)) return false;
    ll tong = 1;
    double m = sqrt(n);
    for(int i=2;i<m;i++){
        if(n%i==0){
            tong += i;
            tong += n/i;
        }
    }
    m = int(m);
    if(m*m==n) tong += m;
    return tong == n;
}
int main(){
    faster();
    int t;
    cin >> t;
    while(t--){
        ll n;
        cin >> n;
        if(check(n)) cout << "1" << endl;
        else cout << "0" << endl;
    }
}