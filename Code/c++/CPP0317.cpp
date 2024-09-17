#include<bits/stdc++.h>
using namespace std;
bool check(string s){
    int l = 0;
    int r = s.size() - 1;
    while(l<=r){
        if(s[l]!=s[r]) return false;
        else if( (s[l]-'0') % 2 != 0) return false;
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
        if (check(s)) cout << "YES" << endl;
        else cout << "NO" << endl;
    }
}