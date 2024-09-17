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
        set<ll> s;
        for(int i=0;i<n;i++){
            ll x;
            cin >> x;
            a[i] = -1;
            if(x >=0 && x < n) s.insert(x);
        }
        for(ll i : s){
            a[i] = i;
        }
        for(int i : a){
            cout << i << " ";
        }
        cout << endl;
    }
}