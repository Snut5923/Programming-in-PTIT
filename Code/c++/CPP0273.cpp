#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int a[n+1];
        a[0] = 0;
        for(int i=1;i<=n;i++){
            int x;
            cin >> x;
            a[i] = a[i-1] + x;
        }
        int ok = 0;
        for(int i=2;i<=n-1;i++){
            if(a[i-1] == a[n]-a[i]){
                cout << i << endl;
                ok = 1;
                break;
            }
        }
        if(ok==0) cout << -1 << endl;
    }
}