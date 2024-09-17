#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        multiset<int> s;
        while(n--){
            int x;
            cin >> x;
            s.insert(x);
        }
        for(int i : s){
            cout << i << " ";
        }
        cout << endl;
    }
}