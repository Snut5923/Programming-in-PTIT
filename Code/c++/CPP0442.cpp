#include<bits/stdc++.h>
using namespace std;
bool check(string s,int m){
    int i = s.find(to_string(m));
    return i >= 0 && i <= s.size();
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,m;
        cin >> n >> m;
        string s = "";
        while(n--){
            int x;
            cin >> x;
            s += to_string(x);
        }
        if (check(s,m)) cout << "1" << endl;
        else cout << "-1" << endl;
    }
}