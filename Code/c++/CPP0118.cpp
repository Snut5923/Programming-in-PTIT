#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int dem = 0;
        int ok = 0;
        map<int,int> mp;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                while(n%i==0){
                    dem++;
                    n/= i;
                }
                if(dem >= 1){
                    mp[i] = dem;
                    dem = 0;
                }
            }
            
        }
        if(mp.size() != 3) cout << "0" << endl;
        else{
            for(auto i : mp){
                if(i.second > 1){
                    ok = 1;
                    cout << "0" << endl;
                    break;
                }
            }
            if(ok==0) cout << "1" << endl;
        }
    }
}