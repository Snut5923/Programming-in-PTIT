#include<bits/stdc++.h>
using namespace std;
bool check(char i){
    return i=='.' || i=='?' || i=='!';
}
void chuanhoa(string s){
    int n = s.size() - 2;
    if(check(s[n]) && s[n-1]==' '){
        s[n-1] = s[n];
        s[n] = ' ';
    }
    else if(!check(s[n])) s[n+1] = '.';
    s[0] = toupper(s[0]);
    for(int i=1;i<s.size();i++){
        if(isalpha(s[i])) s[i] = tolower(s[i]);
    }
    cout << s << endl;
}
int main(){
    string s;
    vector<string> v;
    string x = "";
    while(getline(cin,s)){
        getline(cin,s);
        stringstream ss(s);
        string tmp;
        while(ss >> tmp){
            int n = tmp.size();\
            x += tmp + " ";
            if(check(tmp[n-1])){
                v.push_back(x);
                x = "";
            }
        }
        if(x.size() > 0){
            v.push_back(x);
            x = "";
        }
    }
    for(auto i : v) chuanhoa(i);
}
