#include<bits/stdc++.h>
using namespace std;
int tien(string a,string b){
    if(a=="Xe_con" && b=="5") return 10000;
    if(a=="Xe_con" && b=="7") return 15000;
    if(a=="Xe_tai" && b=="2") return 20000;
    if(a=="Xe_khach" && b=="29") return 50000;
    if(a=="Xe_khach" && b=="45") return 70000;
}
int main(){
    int t;
    cin >> t;
    cin.ignore();
    map<string,int> mp;
    while(t--){
        string s;
        getline(cin,s);
        stringstream ss(s);
        string tmp;
        vector<string> v;
        while(ss >> tmp){
            v.push_back(tmp);
        }
        if(v[3]=="IN") mp[v[4]] += tien(v[1],v[2]);
    }
    for(auto i : mp) cout << i.first << ": " << i.second << endl;
}
