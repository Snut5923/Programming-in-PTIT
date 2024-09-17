#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        map<int,int> mp;
        int ok = 0;
        int res = -1;
        while(n--){
            int x;
            cin >> x;
            if(mp[x]==1 && ok == 0){
                ok = 1;
                res = x;
            }
            mp[x]++;
        }
        cout << res << endl;
    }
}