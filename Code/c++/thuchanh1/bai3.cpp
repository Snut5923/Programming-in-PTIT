#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
    int t;
    cin >> t;
    while(t--){
        ll n;
        cin >> n;
        ll tong = 0;
        for(int i=1;i<=sqrt(n);i++){
            if(n%i==0) tong += i;
            if(n%(n/i)==0 && i != n/i) tong += n/i;
        }
        cout << tong << endl;
    }
}