#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,m;
        cin >> n >> m;
        map<int,int> a;
        map<int,int> b;
        set<int> s;
        for(int i=0;i<n;i++){
            int x;
            cin >> x;
            a[x] = 1;
            s.insert(x);
        }
        for(int i=0;i<m;i++){
            int x;
            cin >> x;
            b[x] = 1;
            s.insert(x);
        }
        for(int i : s){
            cout << i << " ";
        }
        cout << endl;
        for(int i : s){
            if(a[i]==1 && b[i]==1) cout << i << " ";
        }
        cout << endl;
    }
}