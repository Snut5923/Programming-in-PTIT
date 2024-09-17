#include<bits/stdc++.h>
using namespace std;
bool check(string s){
    int l = 0;
    int r = s.size() - 1;
    while(l<r){
        if(s[l] != s[r]) return 0;
        l++;
        r--;
    }
    return s.size()>1;
}
bool cmp(string a,string b){
    if(a.size() != b.size()){
        if(a.size() < b.size()) return 0;
        return 1;
    }
    else{
        int n = a.size();
        for(int i=0;i<n;i++){
            if(a[i] < b[i]) return 0;
            if(a[i] > b[i]) return 1;
        }
    }
}
int main(){
    string s;
    vector<string> v;
    map<string,int> mp;
    while(getline(cin,s)){
        stringstream ss(s);
        string tmp;
        while(ss >> tmp){
            if(check(tmp)){
              if(mp[tmp]==0) v.push_back(tmp);
                mp[tmp]++;  
            }           
        }
    }
    sort(v.begin(),v.end(),cmp);
    for(auto i : v){
        cout << i << " " << mp[i] << endl;
    }
}