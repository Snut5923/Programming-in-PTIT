#include<bits/stdc++.h>
using namespace std;
string chuanhoa(string s){
    stringstream ss(s);
    string tmp;
    vector<string> v;
    while(ss >> tmp){
        v.push_back(tmp);
    }
    string kq = "";
    int n = v.size();
    for(char i : v[n-1]){
        kq += tolower(i);
    }
    for(int i=0;i<n-1;i++){
        kq += tolower(v[i][0]);
    }
    return kq;
}
int main(){
    int t;
    cin >> t;
    cin.ignore();
    map<string,int> mp;
    while(t--){
        string s;
        getline(cin,s);
        string a = chuanhoa(s);
        mp[a]++;
        if(mp[a]>1) cout << a << to_string(mp[a]) << "@ptit.edu.vn" << endl;
        else cout << a << "@ptit.edu.vn" << endl;
    }
}