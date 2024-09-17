#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    cin.ignore();
    while(t--){
        string s;
        string x;
        getline(cin,s);
        if(s[0]=='+') s = '0'+s.substr(3,s.size()-3);
        else if(s[0]=='8' && s[1] =='4') s = '0' + s.substr(2,s.size()-2);
        for(auto i : s){
            if(isdigit(i)) x += i;
        }
        cout << x << endl;
    }
}