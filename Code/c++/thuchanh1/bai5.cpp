#include<bits/stdc++.h>
using namespace std;
int tong(int n){
    int res = 0;
    while(n){
        res += n%10;
        n /= 10;
    }
    return res;
}
int main(){
    int t=1;
    while(t--){
        int res = 0;
        int n;
        cin >> n;
        int x = n;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                while(n%i==0){
                    
                    res += tong(i);
                    n/= i;
                }
            }
        }
        if(res == tong(x)) cout << "YES" << endl;
        else cout << "NO" << endl;
    }
}