#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
    map<ll,int> mp;
    ll fb[93];
    mp[0] = 1;
    mp[1] = 1;
    fb[0] = 0;
    fb[1] = 1;
    for(int i=2;i<=92;i++){
        fb[i] = fb[i-1] + fb[i-2];
        mp[fb[i]] = 1;
    }
    int t;
    cin >> t;
    while(t--){
        ll n;
        cin >> n;
        if(mp[n]==1) cout << "YES" << endl;
        else cout << "NO" << endl;
    }
    
}