#include<bits/stdc++.h>
using namespace std;
bool nt(int n){
    for(int i=2;i*i<=n;i++){
        if(n%i==0) return false;
    }
    return n>1;
}
int tong(int n){
    string s = to_string(n);
    int tong = 0;
    for(auto i : s){
        tong += i - '0';
    }
    return tong;
}
int tonguoc(int n){
    int res = 0;
    for(int i=2;i<=n;i++){
        if(n%i==0){
            while(n%i==0){
                n/=i;
                res += tong(i);
            }
        }
    }
    return res;
}
bool check(int n){
    return !nt(n) && (tong(n) == tonguoc(n)) ;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        if(check(n)) cout << "YES" << endl;
        else cout << "NO" << endl;
    }
}