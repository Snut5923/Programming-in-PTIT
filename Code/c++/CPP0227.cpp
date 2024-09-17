#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int a[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cin >> a[i][j];
            }
        }
        int ok = 0;
        for(int i=0;i<n;i++){
            if (ok == 0){
                for(int j=0;j<n;j++){
                    cout << a[i][j] << " ";
                }
                ok = 1;
            }
            else{
                for(int j=n-1;j>=0;j--){
                    cout << a[i][j] << " ";
                }
                ok = 0;
            }
        }
        cout << endl;
    }
}