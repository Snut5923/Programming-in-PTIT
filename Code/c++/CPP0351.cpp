#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        cin.ignore();
        string s;
        getline(cin,s);
        stringstream ss(s);
        string tmp;
        vector<string> v;
        while(ss >> tmp){
            string x = "";
            x += toupper(tmp[0]);
            for(int i=1;i<tmp.size();i++){
                x += tolower(tmp[i]);
            }
            v.push_back(x);
        }
        int m = v.size();
        if(n==1){
            cout << v[m-1] << " ";
            for(int i=0;i<m-1;i++) cout << v[i] << " ";
            cout << endl;
        }
        else{
            for(int i=1;i<m;i++) cout << v[i] << " ";
            cout << v[0] << endl;
        }
    }
}