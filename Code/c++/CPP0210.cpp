#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int a[n];
        for(int i=0;i<n;i++){
            cin >> a[i];
        }
        int res = INT_MIN;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if (a[j] > a[i]){
                    if(res < a[j] - a[i]) res = a[j] - a[i];
                }
            }
        }
        if (res < 0) cout << "-1" << endl;
        else cout << res << endl;
    }
}