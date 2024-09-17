#include<bits/stdc++.h>
using namespace std;
void xuli(long long n){
    if(n%2==0){
        while(n%2==0){
            cout << "2 ";
            n/=2;
        }
    }
    for(long long i=3;i*i<=n;i+=2){
        if(n%i==0){
            while(n%i==0){
                cout << i << " " ;
                n/=i;
            }
        }
    }
    if (n>3) cout << n ;
    cout << endl;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        long long n;
        cin >> n;
        xuli(n);
    }
}