#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,k;
        cin >> n >> k;
        set<int> s;
        for(int i=0;i<n;i++){
            int x;
            cin >> x;
            s.insert(x);
        }
        int ok = 0;
        for(int i : s){
            int x = i + k;
            if(s.find(x) != s.end()){
                ok = 1;
                cout << 1 << endl;
                break;
            }
        }
        if(ok==0) cout << -1 << endl;
        
    }
}