#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        map<int,int> mp;
        map<int,int> idx;
        vector<int> v;
        int res = -1;
        int ok = 0;
        int kq;
        for(int i=0;i<n;i++){
            int x;
            cin >> x;
            v.push_back(x);
            if(mp[x]==0){
                mp[x]++;
                idx[x] = i;
            }
            else{
                if(mp[x] == 1){
                    if(ok == 0){
                        res = idx[x];
                        ok = 1;
                    }
                    else{
                        res = min(res,idx[x]);
                    }
                }
            }

        }
        if(res == -1) cout << "NO" << endl;
        else cout << v[res] << endl;
    }
}