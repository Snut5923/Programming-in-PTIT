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
        long a,b;
        cin >> a >> b;
        cout << lcm(a,b) << " " << gcd(a,b) << endl;
    }
}