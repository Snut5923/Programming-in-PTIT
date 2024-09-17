#include<bits/stdc++.h>
using namespace std;
using ll = long long;
ll max(string a){
    ll x = 0;
    for(int i=0;i<a.size();i++){
        if(a[i]=='5'){
            x = x*10 + 6;
        }
        else x = x*10 + a[i] - '0';
    }
    return x;
}
ll min(string a){
    ll x = 0;
    for(int i=0;i<a.size();i++){
        if(a[i]=='6'){
            x = x*10 + 5;
        }
        else x = x*10 + a[i] - '0';
    }
    return x;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        string a,b;
        cin >> a >> b;
        ll Max = max(a) + max(b);
        ll Min = min(a) + min(b);
        cout << Min << " " << Max << endl;
    }
}