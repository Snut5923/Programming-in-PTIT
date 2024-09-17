#include<bits/stdc++.h>
using namespace std;
bool nt(int n){
    for (int i=2;i*i<=n;i++){
        if(n%i==0) return false;
    }
    return n>1;
}
void xuli(int n){
    for (int i=2;i*i<=n;i++){
        if (nt(i)) cout << i*i << " ";
    }
    cout << endl;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        xuli(n);
    }
    return 0;
}