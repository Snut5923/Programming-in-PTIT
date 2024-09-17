#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        queue<string> q;
        q.push("0");
        q.push("1");
        while(1){
            if (q.empty()) break;
            string x = q.front();
            q.pop();
            if (x.size() <= n){
                if(x.size()==n) cout << x << " ";
                q.push(x + "0");
                q.push(x + "1");
            }
        }
        cout << endl;
    }
}
