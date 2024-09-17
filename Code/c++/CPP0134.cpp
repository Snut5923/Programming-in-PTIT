#include<bits/stdc++.h>
using namespace std;
void xuli(int n,int k){
    int dem = 0;
    if(n%2==0){
        while(n%2==0){
            dem += 1;
            n/=2;
            if (dem == k){
                cout << "2" << endl;
                return;
            }
        }
    }
    for(int i=3;i*i<=n;i+=2){
        if(n%i==0){
            while(n%i==0){
                dem+=1;
                n/=i;
                if (dem == k){
                    cout << i << endl;
                    return;
                }
            }
        }
    }
    if (n>3) {
        dem += 1;
        if (dem == k){
            cout << n << endl;
            return;
        }
    }
    if (dem < k) cout << "-1" << endl;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,k;
        cin >> n >> k;
        xuli(n,k);
    }
}