#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        ll mod;
        cin >> s >> mod;
        ll kq = 0;
        for(char i : s){
            kq = (kq * 10 + (i-'0'))%mod;
        }
        cout << kq << endl;
    }
}
