#include<bits/stdc++.h>
using namespace std;
int nhan(int n){
    if(n==1||n==6) return 2;
    else if(n==2||n==7) return 4;
    else if(n==3||n==8) return 6;
    else if(n==4||n==9) return 8;
    return 0;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        int n = s.size();
        int cuoi = 0;
        int mu = 1;
        for(int i=n-1;i>=0;i--){
            if(s[i]=='1'){
                cuoi += mu;
                cuoi %= 10;
            }
            mu = nhan(mu);
        }
        if (cuoi == 5 || cuoi ==0) cout << "Yes" << endl;
        else cout << "No" << endl;
    }
}