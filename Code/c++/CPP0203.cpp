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
        sort(a,a+n);
        int ok = 0;
        for(int i=1;i<n;i++){
            if (a[i] - a[i-1] > 1){
                if (a[i] > 1){
                    if(a[i-1] > 0){
                        ok = 1;
                        cout << a[i-1] + 1 << endl;
                        break;
                    }
                    else{
                        cout << "1" << endl;
                        ok = 1;
                        break;
                    }
                }
            }
        }
        if (ok == 0){
            if (a[n-1] >= 0) cout << a[n-1]+1 << endl;
            else cout << "1" << endl;
        }
    }
}