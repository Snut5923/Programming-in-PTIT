#include<bits/stdc++.h>
using namespace std;
bool check(string s){
    int n = s.size();
    int tong = 0;
    for(int i=0;i<n;i++){
        if(i%2==0) tong += (s[i] - '0');
        else tong -= (s[i]-'0');
    }
    return (abs(tong)%11==0);
}
int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        if (check(s)) cout << "1" << endl;
        else cout << "0" << endl;
    }
}