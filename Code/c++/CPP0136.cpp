#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
    map<int,int> mp;
    for(int i=3;i*i<=1000000;i+=2){
        if(mp[i]==0){
            for(int j=i*i;j<=1000000;j+=i){
                if(j%2!=0){
                    mp[j] = 1;
                }
            }
        }
    }
    int t;
    cin >> t;
    while(t--){
        ll n;
        cin >> n;
        int dem = 0;
        for(int i=2;1ll*i*i<=n;i++){
            if(i%2!=0 && mp[i]==0) dem++;
        }
        if(4 <= n) dem++;
        cout << dem << endl;
    }

}