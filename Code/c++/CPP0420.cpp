#include<bits/stdc++.h>
using namespace std;
vector<pair<int,int>> v;
int x;
bool cmp(pair<int,int> a,pair<int,int> b){
    if(a.second != b.second) return a.second < b.second;
    return a.first < b.first;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n >> x;
        int a[n];
        for(int i=0;i<n;i++){
            cin >> a[i];
            v.push_back({i,abs(a[i]-x)});
        }
        sort(v.begin(),v.end(),cmp);
        for(auto i : v){
            cout << a[i.first] << " ";
        }
        cout << endl;
        v.clear();
    }
}