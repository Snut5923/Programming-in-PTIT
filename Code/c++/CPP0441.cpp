#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,m;
        cin >> n >> m;
        int ok = 0;
        for(int i=1;i<=n;i++){
            int x;
            cin >> x;
            if(x==m){
                if (ok == 0) cout << i << endl;
                ok = 1;
            }
        }
        if (ok==0) cout << "-1" << endl;
    }
}