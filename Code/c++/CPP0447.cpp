#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,k;
        cin >> n >> k;
        multiset<int> s;
        while(n--){
            int x;
            cin >> x;
            s.insert(x);
        }
        for(auto it = --s.end(); it != s.begin(); --it){
            if(k==0) break;
            k--;
            cout << *it << " ";
        }
        cout << endl;
    }
}