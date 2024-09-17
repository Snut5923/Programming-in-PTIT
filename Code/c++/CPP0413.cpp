#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int a[n];
        for(int i=0;i<n;i++){
            cin >> a[i];
        }
        sort(a,a+n);
        vector<int> lon;
        vector<int> nho;
        for(int i=0;i<n;i++){
            if(i < n/2){
                nho.push_back(a[i]);
            }
            else lon.push_back(a[i]);
        }
        for(int i=0;i<n/2;i++){
            cout << lon[lon.size()-1-i] << " " << nho[i] << " ";
        }
        if(n/2 < n - n/2) cout << lon[0];
        cout << endl;
    }
}