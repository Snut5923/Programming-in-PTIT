#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,k,b;
    cin >> n >> k >> b;
    int a[n] = {0};
    for(int i=0;i<b;i++){
        int x;
        cin >> x;
        a[x-1] = 1;
    }
    int dem = 0;
    for(int i=0;i<k;i++){
        if(a[i]==1) dem++;
    }
    int res = dem;
    for(int i=k;i<n;i++){
        if(a[i-k]==1) dem--;
        if(a[i]==1) dem++;
        res = min(res,dem);
    }
    cout << res << endl;
}