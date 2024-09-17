#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
    int t;
    cin >> t;
    while(t--){
        string a;
        ll b,m;
        cin >> a >> b >> m;
        ll mod = 0;
        for(char i : a){
            mod = (mod*10 + (i-'0'))%m;
        }
        ll res = 1;
        while (b - 1) {
            if (b % 2)
                res = (res * mod)%m;
            mod = (mod * mod) % m;
            b /= 2;
        }
        cout << (res*mod)%m << endl;
    }
}