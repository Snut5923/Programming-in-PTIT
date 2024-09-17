#include<bits/stdc++.h>
using namespace std;
bool check1(string s){
    for(int i=1;i<s.size();i++){
        if(s[i] - s[i-1] <= 0) return false;
    }
    return true;
}
bool check2(string s){
    for(int i=1;i<s.size();i++){
        if(s[i]!=s[i-1]) return false;
    }
    return true;
}
bool check3(string s){
    return s[0]==s[1] && s[1]==s[2] && s[3]==s[4];
}
bool check4(string s){
    for(char i : s){
        if(i!='6' && i!='8') return false;
    }
    return true;
}
bool check(string s){
    return check1(s) || check2(s) || check3(s) || check4(s);
}
int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        int y = (s[5]-'0')*10000+(s[6]-'0')*1000+(s[7]-'0')*100+(s[9]-'0')*10+(s[10]-'0');
        string x = to_string(y);
        if(check(x)) cout << "YES" << endl;
        else cout << "NO" << endl; 
    }
}