#include<bits/stdc++.h>
using namespace std;
using ll = long long ;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,m;
        cin >> n >> m;
        set<long> a;
        set<long> b;
        while(n--){
            long x;
            cin >> x;
            a.insert(x);
        }
        while(m--){
            long x;
            cin >> x;
            b.insert(x);
        }
        long x = *a.rbegin();
        long y = *b.begin();
        long long kq = 1ll*x*y;
        cout << x*y << endl;
    }
}