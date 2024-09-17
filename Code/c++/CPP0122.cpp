#include<bits/stdc++.h>
using namespace std;
long gcd(long a,long b){
    long r;
    while(b){
        r = a%b;
        a = b;
        b = r;
    }
    return a;
}
long long lcm(long a,long b){
    return a*b/gcd(a,b);
}
int main(){
    int t;
    cin >> t;
    while(t-->0){
        long n;
        cin >> n;
        long res = 1;
        for(long i=1;i<=n;i++){
            res = lcm(i,res);
        }
        cout << res << endl;
    }
}