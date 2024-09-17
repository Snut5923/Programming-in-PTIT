#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n,p;
        cin >> n >> p;
        int x = 0;
        for(int i=p;i<=n;i++){
            if(i%p==0){
                int tmp = i;
                while(tmp%p==0){
                    tmp/=p;
                    x++;
                }
            }
        }
        cout << x << endl;
    }
}