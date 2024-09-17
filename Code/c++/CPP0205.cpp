#include<bits/stdc++.h>
using namespace std;
int max(int a,int b){
    if (a > b) return a;
    return b;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int res = -1;
        while(n--){
            int x;
            cin >> x;
            res = max(res,x);
        }
        cout << res << endl;
    }
}