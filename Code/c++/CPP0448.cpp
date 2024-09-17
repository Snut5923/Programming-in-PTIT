#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,x;
        cin >> n >> x;
        map<int,int> mp;
        while(n--){
            int y;
            cin >> y;
            mp[y]++;
        }
        if (mp[x] == 0) cout << "-1" << endl;
        else cout << mp[x] << endl;
    }
}