#include<bits/stdc++.h>
using namespace std;
bool cmp(string a,string b){
    return a+b > b+a;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        string a[n];
        for(int i=0;i<n;i++){
            cin >> a[i];
        }
        sort(a,a+n,cmp);
        for(string i : a) cout << i;
        cout << endl;
    }
}