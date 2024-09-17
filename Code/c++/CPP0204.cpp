#include<bits/stdc++.h>
using namespace std;
int main(){
    map<int,int> mp;
    mp[1] = 1;
    for(int i=3;i*i<=100000;i+=2){
        if(mp[i]==0){
            for(int j=i*i;j<=100000;j+=i){
                if(j%2!=0) mp[j] = 1;
            }
        }
    }
    int t;
    cin >> t;
    while(t--){
        int l,r;
        cin >> l >> r;
        int dem = 0;
        if (l<=2 && 2<=r) dem++;
        for(int i=l;i<=r;i++){
            if(i%2!=0 && mp[i]==0) dem++;
        }
        cout << dem << endl;
    }
}