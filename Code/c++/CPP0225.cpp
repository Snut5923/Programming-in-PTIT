#include<bits/stdc++.h>
using namespace std;
void xuli(int n){
    int hang[n] = {0};
    int cot[n] = {0};
    int a[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cin >> a[i][j];
            hang[i] += a[i][j];
            cot[j] += a[i][j];
        }
    }
    int summax = 0;
    for(int i=0;i<n;i++){
        summax = max(summax,hang[i]);
    }
    for(int i=0;i<n;i++){
        summax = max(summax,cot[i]);
    }
    int kq = 0;
    for(int i=0,j=0;i<n,j<n;){
        int x = max(summax - cot[i],summax - hang[j]);
        cot[i] += x;
        hang[j] += x;
        kq += x;
        if(cot[i] == summax) i++;
        if(hang[j] == summax) j++;
    }
    cout << kq << endl;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        xuli(n);
    }
}