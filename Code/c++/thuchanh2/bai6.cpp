#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    unordered_map<int,vector<string>> v;
    vector<string> kq;
    queue<string> q;
    q.push("0");
    q.push("1");
    while(true){
        string x = q.front();
        if(x.size() <= 20){
            q.push(x + '0');
            q.push(x + '1');
        }
        // v[x.size()].push_back(x);
        kq.push_back(x);
        q.pop();
        if(q.empty()) break;
    }
    while(t--){
        int n;
        cin >> n;
        for(auto i : kq){
            if(i.size()==n) cout << i << " ";
        }
        cout << endl;
    }
}