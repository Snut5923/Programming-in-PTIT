#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    cin.ignore();
    while(t--){
        string s;
        getline(cin,s);
        stringstream ss(s);
        string tmp;
        string kq = "";
        while(ss >> tmp){
            kq = tmp + " " + kq;
        }
        cout << kq << endl;
    }
}