#include<bits/stdc++.h>
using namespace std;
using ll = long long;
ll bcnn(ll a,ll b){
    return a*b/(__gcd(a,b));
}
int main(){
    int t;
    cin >> t;
    while(t--){
        ll x,y,z,n;
        cin >> x >> y >> z >> n;
        ll res = bcnn(bcnn(x,y),z);
        if(to_string(res).size()==n) cout << res << endl;
        else{
            ll k = pow(10,n-1);
            ll i = ll(k/res)-1;
            while(true){
                ll kq = res * i;
                i++;
                if(to_string(kq).size()==n){
                    cout << kq << endl;
                    break;
                }
                else{
                    if(to_string(kq).size() > n){
                        cout << "-1" << endl;
                        break;
                    }
                }
            }
        }
    }
}