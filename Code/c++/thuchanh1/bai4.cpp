#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    cin.ignore();
    vector<int> v;
    int mot = 0, hai = 0;
    int x = 0;
    while(t--){
        string s;
        getline(cin,s);
        int dem = 0;
        stringstream ss(s);
        string tmp;
        while(ss >> tmp) dem++;
        if((dem==6 || dem==8)){
            if(hai==1) hai = 0;
            if (mot == 0){
                v.push_back(1);
                mot = 1;
            }
        }
        if(dem == 7){
            x++;
            if(mot==1) mot = 0;
            if(x == 4){
                v.push_back(2);
                hai = 1;
                x = 0;
            }
        }
    }
    cout << v.size() << endl;
    for(int i : v) cout << i << endl;
}


