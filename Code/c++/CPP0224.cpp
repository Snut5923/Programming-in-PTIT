#include<bits/stdc++.h>
using namespace std;
int n,m;
int a[200][200];
int di[8] = {-1,-1,-1,0,0,1,1,1};
int dj[8] = {-1,0,1,-1,1,-1,0,1};
void loang(int i,int j){
    a[i][j] = 0;
    for(int x=0;x<8;x++){
        if(i+di[x] >= 0 && i+di[x] <= n && j+dj[x] >=0 && j+dj[x] <=m && a[i+di[x]][j+dj[x]]==1){
            loang(i+di[x],j+dj[x]);
        }
    }
}
int main(){
    int t;
    cin >> t;
    while(t--){
        cin >> n >> m;
        int dem = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                cin >> a[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==1){
                    loang(i,j);
                    dem++;
                }
            }
        }
        cout << dem << endl;
    }
}