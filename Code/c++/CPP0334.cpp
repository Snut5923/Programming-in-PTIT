#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        ll res = 0;
        ll tmp = 0;
        for(char i : s){
            if(isdigit(i)){
                tmp = tmp*10 + (i-'0');
            }
            else{
                res += tmp;
                tmp = 0;
            }
        }
        if (tmp > 0) res += tmp;
        cout << res << endl;
    }
}