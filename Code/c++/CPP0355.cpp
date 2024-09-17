#include<bits/stdc++.h>
using namespace std;
int main(){
    int t = 4;
    vector<string> v;
    string x = "";
    string s;
    while(getline(cin,s)){
        stringstream ss(s);
        string tmp;
        
        while(ss >> tmp){
            int n = tmp.size() - 1;
            if(tmp[n]=='.' || tmp[n] == '!' || tmp[n] == '?'){
                x += tmp.substr(0,n);
                v.push_back(x);
                x = "";
            }
            else x += tmp + " ";
        }
    }   
    for(string x : v){
        
        for(int i=0;i<x.size();i++){
            if(i==0) x[i] = toupper(x[i]);
            else x[i] = tolower(x[i]);
            cout << x[i];
        }
        cout << endl;
    }
}