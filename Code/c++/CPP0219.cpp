#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,m;
        cin >> n >> m;
        int a[n][m];
        vector<pair<int,int>> v;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                cin >> a[i][j];
                if (a[i][j] == 1) v.push_back({i,j});
            }
        }
        for(auto i : v){
            int hang = i.first;
            int cot = i.second;
            for(int i=0;i<m;i++){
                a[hang][i] = 1;
            }
            for(int i=0;i<n;i++){
                a[i][cot] = 1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                cout << a[i][j] << " ";
            }
            cout << endl;
        }
    }
}