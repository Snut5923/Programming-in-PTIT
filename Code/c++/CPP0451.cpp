#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,k,x;
        cin >> n;
        vector<int> v;
        for(int i=0;i<n;i++){
            int x;
            cin >> x;
            v.push_back(x);
        }
        cin >> k >> x;
        auto it = lower_bound(v.begin(),v.end(),x);
        int idx = it - v.begin();
        int j = k/2;
        for(int i=idx-j;i<idx;i++){
            if(i>=0) cout << v[i] << " ";
            else cout << "0 ";
        }
        for(int i=idx+1;i<=idx+j;i++){
            if(i<n) cout << v[i] << " ";
            else cout << "0 ";
        }
        cout << endl;
    }
}