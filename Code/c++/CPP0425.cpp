#include<bits/stdc++.h>
using namespace std;
vector<pair<int,int>> v; 
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int a[n];
        int b[n];
        for(int i=0;i<n;i++){
            cin >> a[i];
        }
        sort(a,a+n);
        int idx = 0;
        for(int i=0;i<n;i+=2){
            b[i] = a[idx++];
        }
        for(int i=1;i<n;i+=2){
            b[i] = a[idx++];
        }
        for(int i : b){
            cout << i << " ";
        }
        cout << endl;
    }
}