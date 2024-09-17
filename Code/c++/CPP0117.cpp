#include<bits/stdc++.h>
using namespace std;
int tong(string s){
    if(s.size()==1) return s[0] - '0';
    int x = 0;
    for(char i : s){
        x += i - '0';
    }
    return tong(to_string(x));
}
int main(){
    int t;
    cin >> t;
    while(t-->0){
        string s;
        cin >> s;
        cout << tong(s) << endl;
    }
    return 0;
}

