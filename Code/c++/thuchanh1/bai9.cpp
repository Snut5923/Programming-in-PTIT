#include<bits/stdc++.h>
using namespace std;
using l = long;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        l m;
        cin >> n >> m;
        l a[n+1];
        int idx;
        l res = -1e9;
        for(int i=0;i<n;i++){
            cin >> a[i];
            if(a[i] > res){
                res = a[i];
                idx = i;
            }
        }
        for(int i=n-1;i>=idx;i--) a[i+1] =a[i];
        a[idx] = m;
        set<int> s;
        for(int i=0;i<=n;i++){
            if(a[i]<0) cout << a[i] << " ";
            else s.insert(i);
        }
        for(l i : s) cout << a[i] << " ";
        cout << endl;
    }
}