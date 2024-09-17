#include<bits/stdc++.h>
using namespace std;
int main(){
    map<int,int> mp;
    int fb[18];
    mp[0] = 1;
    mp[1] = 1;
    fb[0] = 0;
    fb[1] = 1;
    for(int i=2;i<18;i++){
        fb[i] = fb[i-1] + fb[i-2];
        mp[fb[i]] = 1;
    }
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        while(n--){
            int x;
            cin >> x;
            if(mp[x]==1) cout << x << " ";
        }
        cout << endl;
    }
}