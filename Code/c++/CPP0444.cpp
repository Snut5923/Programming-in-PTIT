#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,x;
        cin >> n >> x;
        for(int i=1;i<=n;i++){
            int y;
            cin >> y;
            if (y==x){
                cout << i << endl;
            }
        }
    }
}