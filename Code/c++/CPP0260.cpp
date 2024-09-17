#include<bits/stdc++.h>
using namespace std;
void xuli(int n){
    vector<int> v;
    int x = n*n;
    int a[n][n];
    while(x--){
        int y;
        cin >> y;
        v.push_back(y);
    }
    sort(v.begin(),v.end());
    int idx = 0;
    int tren,duoi,trai,phai;
    tren = 0;
    duoi = n - 1;
    trai = 0;
    phai = n - 1;
    while(tren <= duoi && trai <= phai){
        for(int i=trai;i<=phai;i++){
            a[tren][i] = v[idx];
            idx++;
        }
        tren++;
        for(int i=tren;i<=duoi;i++){
            a[i][phai] = v[idx];
            idx++;
        }
        phai--;
        if(trai <= phai){
            for(int i=phai;i>=trai;i--){
                a[duoi][i] = v[idx];
                idx++;
            }
            duoi--;
        }
        if(tren <= duoi){
            for(int i=duoi;i>=tren;i--){
                a[i][trai] = v[idx];
                idx++;
            }
            trai++;
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++) cout << a[i][j] << " ";
        cout << endl;
    }
}
int main(){
    int t=1;
    while(t--){
        int n;
        cin >> n;
        xuli(n);
    }
}