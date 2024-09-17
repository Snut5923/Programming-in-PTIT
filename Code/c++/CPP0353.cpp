#include<bits/stdc++.h>
using namespace std;
char doi(char c){
    if(c=='A'||c=='B'||c=='C') return '2';
    else if(c=='D'||c=='E'||c=='F') return '3';
    else if(c=='G'||c=='H'||c=='I') return '4';
    else if(c=='J'||c=='K'||c=='L') return '5';
    else if(c=='M'||c=='N'||c=='O') return '6';
    else if(c=='P'||c=='Q'||c=='R'||c=='S') return '7';
    else if(c=='T'||c=='U'||c=='V') return '8';
    return '9';
}
bool check(string s){
    int l = 0;
    int r = s.size()-1;
    while(l<r){
        if(s[l] != s[r]) return false;
        l++;
        r--;
    }
    return true;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        string x = "";
        for(char i : s){
            x += doi(toupper(i));
        }
        if(check(x)) cout << "YES" << endl;
        else cout << "NO" << endl;
    }
}