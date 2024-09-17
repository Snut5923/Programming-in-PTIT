#include<bits/stdc++.h>
using namespace std;
using l = long;
int main(){
    int t;
    cin >> t;
    while(t--){
        l n;
        cin >> n;
        if(n%2!=0) cout << "0" << endl;
        else{
            l dem = 0;
            for(l i=1;i*i<=n;i++){
                if(n%i==0){
                    if(i%2==0) dem++;
                    if(i != n/i && (n/i)%2==0) dem++;
                }
            }
            cout << dem << endl;
        }
    }
}