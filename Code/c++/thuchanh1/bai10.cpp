#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    cin.ignore();
    unordered_map<string,int> mp;
    bool check=1;
    string x,y;
    vector<string> v;
    while(t--){
        if(check){
            getline(cin,x);
            v.push_back(x);
            check = 0;
        }
        else{
            getline(cin,y);
            if(y=="") check=1;
            else ++mp[x];
        }
    }
    for(string i : v){
        if(mp[i]){
            cout << i << ": " << mp[i] << endl;
            mp[i] = 0;
        }
    }
}
