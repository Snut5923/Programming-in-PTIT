#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
    int t;
    cin >> t;
    while(t--){
        ll x,y,p;
        cin >> x >> y >> p;
        ll res = 1;
        while(y--){
            res = (res * x%p)%p;
        }
        cout << res << endl;
    }
}