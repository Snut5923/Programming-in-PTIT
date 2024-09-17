#include<bits/stdc++.h>
using namespace std;
long long gt(int n){
    if(n==0||n==1) return 1;
    return n*gt(n-1);
}
int main(){
    string s;
    getline(cin,s);
    stringstream ss(s);
    vector<string> v;
    string tmp;
    while(ss >> tmp){
        v.push_back(tmp);
    }
    int n = v.size();
    string kq = "";
    for(int i=0;i<n-1;i++){
        string x = v[i];
        for(int i=0;i<x.size();i++){
            if(i==0){
                kq += toupper(x[i]);
            }
            else kq += tolower(x[i]);
        }
        kq += " ";
    }
    kq.erase(kq.size()-1,1);
    kq += ", ";
    string x = v[n-1];
    for(int i=0;i<x.size();i++){
        kq += toupper(x[i]);
    }
    cout << kq;
}
