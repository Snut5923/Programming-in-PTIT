#include<bits/stdc++.h>
using namespace std;
int max(int a,int b){
    if(a > b) return a;
    return b;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        int res = -1;
        int tmp = 0;
        for(char i : s){
            if(isdigit(i)){
                tmp = tmp*10 + (i-'0');
            }
            else{
                res = max(res,tmp);
                tmp = 0;
            }
        }
        if (tmp > 0) res = max(res,tmp);
        cout << res << endl;
    }
}