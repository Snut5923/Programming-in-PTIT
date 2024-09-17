#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        string s = "";
        while(n--){
            ll x;
            cin >> x;
            if(x==0){
                s += " " + to_string(x);
            }
            else cout << x << " ";
        }
        s.erase(0,1);
        cout << s << endl;
    }
}