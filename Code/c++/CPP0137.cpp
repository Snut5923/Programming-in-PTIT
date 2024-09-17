#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
    map<ll,int> mp;
    mp[1] = 1;
    for(ll i=3;i*i<=1000000;i+=2){
        if(mp[i]==0){
            for(ll j=i*i;j<=1000000;j+=i){
                if(j%2!=0) mp[j] = 1;
            }
        }
    }
    int t;
    cin >>t;
    while(t--){
        ll l,r;
        cin >> l >> r;
        ll dem = 0;
        for(ll i = sqrt(l);i<=sqrt(r);i++){
            if(i%2!=0 && mp[i]==0) dem++;
        }
        if (4>=l && 4 <=r) dem++;
        cout << dem << endl;
    }
}