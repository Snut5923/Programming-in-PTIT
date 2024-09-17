#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
    ll a[93];
    a[0] = 0;
    a[1] = 1;
    for(int i=2;i<93;i++){
        a[i] = a[i-1] + a[i-2];
    }
    int t;
    cin >> t;
    while(t--){
        int n;
         cin >> n;
         cout << a[n] << endl;
    }
}