#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    int dem = 0;
    int a[n][3];
    for(int i=0;i<n;i++){
        int one = 0,zero = 0;
        for(int j=0;j<3;j++){
            cin >> a[i][j];
            if(a[i][j]==1) one++;
            else zero++;
        }
        if (one > zero) dem++;
    }
    cout << dem << endl;
}