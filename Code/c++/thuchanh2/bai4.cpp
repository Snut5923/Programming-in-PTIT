#include<bits/stdc++.h>
using namespace std;
int main(){
    int n = 3000;
    int a[n+1] = {0};
    for(int i=2;i*i<=n;i++){
        if(a[i]==0){
            for(int j=i*i;j<=n;j+=i){
                a[j] = 1;
            }
        }
    }
    vector<int> v;
    for(int i=2;i<=3000;i++){
        if(a[i]==0) v.push_back(i);
    }
    int t;
    cin >> t;
    for(int i=1;i<=t;i++){
        int idx = 0;
        int m;
        cin >> m;
        cout << "Test " + to_string(i) +":" << endl;
        int a[m][m];
        int tren = 0,duoi = m-1, trai = 0,phai = m-1;
        while(tren <= duoi && trai <= phai){
            //di hang tren cung
            for(int i=trai;i<=phai;i++){
                a[tren][i] = v[idx];
                idx++;
            }
            tren++;
            //di cot phai
            for(int i=tren;i<=duoi;i++){
                a[i][phai] = v[idx];
                idx++;
            }
            phai--;
            //di hang duoi
            if(phai > trai){
                for(int i=phai;i>=trai;i--){
                    a[duoi][i] = v[idx];
                    idx++;
                }
                duoi--;
            }
            if(duoi > tren){
                for(int i=duoi;i>=tren;i--){
                    a[i][trai] = v[idx];
                    idx++;
                }
                trai++;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++) cout << a[i][j] << " ";
            cout << endl;
        }
    }
}