#include<bits/stdc++.h>
using namespace std;
void xuli(int n){
    int dem = 0;
    if(n%2==0){
        while(n%2==0){
            dem += 1;
            n/=2;
        }
        cout << "2 " << dem << endl;
    }
    dem = 0;
    for(int i=3;i*i<=n;i+=2){
        if(n%i==0){
            while(n%i==0){
                dem+=1;
                n/=i;
            }
            cout << i << " " << dem << endl;
            dem = 0;
        }
    }
    if (n>3) cout << n << " 1" << endl;
}
int main(){
    int n;
    cin >> n;
    xuli(n);
}