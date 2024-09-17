#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        unordered_map<char,int> mp;
        vector<char> v;
        for(auto i : s){
            if (mp[i]==0) v.push_back(i);
            mp[i]++;
        }
        for(auto i : v){
            cout << i << mp[i];
        }
        cout << endl;
    }
}