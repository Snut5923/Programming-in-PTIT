#include<bits/stdc++.h>
using namespace std;

int main(){
    int n = pow(10,4);
    int nt[n+1] = {};
    nt[0] = 1;
    nt[1] = 1;
    for(int i=2;i*i<=n;i++){
        if(nt[i]==0){
            for(int j=i*i;j<=n;j+=i){
                nt[j] = 1;
            }
        }
    }
    int t;
    cin >> t;
    while(t--){
        int x;
        cin >> x;
        int ok = 0;
        for(int i=2;i<=x;i++){
            if (nt[i]==0 && nt[x-i]==0){
                cout << i << " " << x-i << endl;
                ok = 1;
                break;
            }
        }
        if (ok==0) cout << endl;
    }
    return 0;
}