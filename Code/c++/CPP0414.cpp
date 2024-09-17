#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        set<int> s;
        while(n--){
            string x;
            cin >> x;
            for(auto i : x){
                s.insert(i - '0');
            }
        }
        for(auto i : s){
            cout << i << " ";
        }
        cout << endl;
    }
}