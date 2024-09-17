#include<bits/stdc++.h>
using namespace std;
using ll = long long;
ll mod = 1e9+7;
int main(){
    int t;
    cin >> t;
    ll fb[1001];
    fb[0] = 0;
    fb[1] = 1;
    for(int i=2;i<=1000;i++){
        fb[i] = (fb[i-1] + fb[i-2])%mod;
    }
    while(t--){
        int n;
        cin >> n;
        cout << fb[n] << endl;
    }
}