#include<bits/stdc++.h>
#include<set>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        set<int> s;
        while(n--){
            int x;
            cin >> x;
            s.insert(x);
        }
        auto i = s.rbegin();
        cout << *i << endl;
    }
}