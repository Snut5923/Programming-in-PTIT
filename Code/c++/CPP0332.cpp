#include<bits/stdc++.h>
using namespace std;
string chuanhoa(string s){
    string tmp = "";
    for(int i=0;i<s.size();i++){
        tmp += tolower(s[i]);
    }
    return tmp;
}
int main(){
    string s;
    getline(cin,s);
    vector<string> v;
    stringstream ss(s);
    string tmp;
    while(ss >> tmp){
        v.push_back(tmp);
    }
    string kq = "";
    int n = v.size();
    kq += chuanhoa(v[n-1]);
    for(int i=0;i<n-1;i++){
        kq += tolower(v[i][0]);
    }
    kq += "@ptit.edu.vn";
    cout << kq;
}