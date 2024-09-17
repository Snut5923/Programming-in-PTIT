#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
    int t;
    cin >> t;
    while(t--){
        ll a,x,y;
        cin >> a >> x >> y;
        ll u = __gcd(x,y);
        while(u--){
            cout << a;
        }
        cout << endl;
    }
}