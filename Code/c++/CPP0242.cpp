#include<bits/stdc++.h>
using namespace std;
int max(int a,int b){
    if(a > b) return a;
    return b;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int a[n+1];
        int b[n+1];
        a[0] = 0;
        b[0] = 0;
        for(int i=1;i<=n;i++){
            int x;
            cin >> x;
            a[i] = a[i-1] + x;
        }
        for(int i=1;i<=n;i++){
            int x;
            cin >> x;
            b[i] = b[i-1] + x;
        }
        int res = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j+1] - a[i] == b[j+1] - b[i]) res = max(res,j-i+1);
            }
        }
        cout << res << endl;
    }
}