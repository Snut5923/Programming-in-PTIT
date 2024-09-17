#include<bits/stdc++.h>
using namespace std;
int main(){
    map<int,int> mp;
    for(int i=3;i*i<=100000;i+=2){
        if(mp[i]==0){
            for(int j=i*i;j<=100000;j+=i){
                if(j%2!=0){
                    mp[j] = 1;
                }
            }
        }
    }
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int dem = 0;
        for(int i=1;i<=n;i++){
            if(__gcd(i,n)==1) dem++;
        }
        if(dem == 0 || dem == 1) cout << "0" << endl;
        else{
            if(dem == 2) cout << "1" << endl;
            else{
                if(dem%2==0) cout << "0" << endl;
                else{
                    if (mp[dem]==0) cout << "1" << endl;
                    else cout << "0" << endl;
                }
            }
        }
    }

}