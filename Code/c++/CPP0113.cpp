#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t-->0){
        string s;
        cin >> s;
        if (s[s.size()-1]=='6' && s[s.size()-2]=='8') cout << "1" << endl;
        else cout << "0" << endl;
    }
}