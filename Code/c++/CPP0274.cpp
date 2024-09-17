#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        map<int,int> mp;
        int dem = 0;
        set<int> s;
        while(n--){
            int x;
            cin >> x;
            s.insert(x);
            mp[x]++;
        }
        for(auto i : s){
            if (mp[i] > 1){
                dem += mp[i];
            }
        }
        cout << dem << endl;
    }
}