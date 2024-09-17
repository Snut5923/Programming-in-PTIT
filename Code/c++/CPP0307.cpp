#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    cin.ignore();
    while(t--){
        string a,b;
        getline(cin,a);
        getline(cin,b);
        stringstream ss1(a);
        stringstream ss2(b);
        set<string> kq;
        string tmp;
        map<string,int> mp1;
        map<string,int> mp2;
        while(ss1 >> tmp){
            mp1[tmp]++;
        }
        while(ss2 >> tmp){
            mp2[tmp]++;
        }
        for(auto i : mp1){
            if(mp2[i.first] == 0) kq.insert(i.first);
        }
        for(string i : kq){
            cout << i << " ";
        }
        cout << endl;
    }
}