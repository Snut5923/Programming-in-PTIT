#include<bits/stdc++.h>
using namespace std;
int main(){
    long long a[93];
    a[1] = 1;
    a[2] = 1;
    for(int i=3;i<=92;i++){
        a[i] = a[i-1] + a[i-2];
    }
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        cout << a[n] << endl;
    }
}