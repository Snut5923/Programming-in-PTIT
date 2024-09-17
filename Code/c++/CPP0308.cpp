#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        vector<char> v;
        map<char,int> mp;
        string s;
        cin >> s;
        for(char i : s){
            if(mp[i]==0) v.push_back(i);
            mp[i]++;
        }
        for(char i : v){
            if (mp[i] == 1) cout << i;
        }
        cout << endl;
    }
}