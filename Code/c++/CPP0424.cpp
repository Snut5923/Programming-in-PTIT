#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,m;
        cin >> n >> m;
        multiset<int> s;
        while(n--){
            int y = m;
            while(y--){
                int x;
                cin >> x;
                s.insert(x);
            }
        }
        for(int i : s){
            cout << i << " ";
        }
        cout << endl;
    }
}