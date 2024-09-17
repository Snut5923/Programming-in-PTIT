#include<bits/stdc++.h>
using namespace std;
void xuli(int n){
    int nt[n+1] = {};
    nt[0] = 1;
    nt[1] = 1;
    for (int i=2;i*i<=n;i++){
        if(nt[i]==0){
            for(int j=i*i;j<=n;j+=i){
                nt[j] = 1;
            }
        }
    }
    for(int i=2;i<=n;i++){
        if (nt[i]==0){
            cout << i << " ";
        }
    }
}
int main(){
    int t;
    cin >> t;
    while(t-->0){
        int n;
        cin >> n;
        xuli(n);
        cout << endl;
    }
    return 0;
}