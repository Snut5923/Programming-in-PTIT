#include<bits/stdc++.h>
using namespace std;
using ll = long long;
ll c(int n){
    return 1ll*n*(n-1)/2;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        ll kq = s.size();
        map<char,int> mp;
        for(auto i : s){
            mp[i]++;
        }
        for(auto i : mp){
            if (i.second > 1) kq += c(i.second);
        }
        cout << kq << endl;
    }
}