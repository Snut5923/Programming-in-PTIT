#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,d;
        cin >> n >> d;
        vector<int> a;
        vector<int> b;
        for(int i=0;i<n;i++){
            int x;
            cin >> x;
            if(i<d){
                b.push_back(x);
            }
            else a.push_back(x);
        }
        for(auto i : a){
            cout << i << " ";
        }
        for(auto i : b){
            cout << i << " ";
        }
        cout << endl;
    }
}