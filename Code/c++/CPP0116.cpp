#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    map<int,int> mp;
    mp[0] = 1;
    mp[1] = 1;
    for(int i=2;i*i<=10000;i++){
        if(mp[i]==0){
            for(int j = i*i;j<=10000;j+=i){
                if(mp[j]==0) mp[j] = i;
            }
        }
    }
    while(t--){
        int n;
        cin >> n;
        for(int i=1;i<=n;i++){
            if(mp[i]==0) cout << i << " ";
            else cout << mp[i] << " ";
        }
        cout << endl;
    }
}