#include<bits/stdc++.h>
using namespace std;
long long max(long long x,long long y){
    if (x>y) return x;
    return y;
}
void xuli(long long n){
    long long res = -1;
    if(n%2==0){
        while(n%2==0){
            n/=2;
        }
        res = max(res,2);
    }
    for(long long i=3;i*i<=n;i+=2){
        if(n%i==0){
            while(n%i==0){
                n/=i;
            }
            res = max(res,i);
        }
    }
    if (n>3) res = max(res,n);
    cout << res << endl;
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