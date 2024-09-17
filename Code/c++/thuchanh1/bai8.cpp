#include<bits/stdc++.h>
using namespace std;
using ll = long long;
ll lon(string s){
    ll x = 0;
    for(auto i : s){
        if(i == '5'){
            x = x*10 + 6;
        }
        else x = x*10 + (i-'0');
    }
    return x;
}
ll nho(string s){
    ll x = 0;
    for(auto i : s){
        if(i == '6'){
            x = x*10 + 5;
        }
        else x = x*10 + (i-'0');
    }
    return x;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        string a,b;
        cin >> a >> b;
        ll x = lon(a) + lon(b);
        ll y = nho(a) + nho(b);
        cout << y << " " << x << endl;
    }
}