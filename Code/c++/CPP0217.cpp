#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,k;
        cin >> n >> k;
        vector<int> v;
        int y = n*n;
        while(y--){
            int x;
            cin >> x;
            v.push_back(x);
        }
        sort(v.begin(),v.end());
        cout << v[k-1] << endl;
    }
}