#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    cin.ignore();
    while(t--){
        string s;
        getline(cin,s);
        stringstream ss(s);
        string tmp;
        int chan = 0,le =0, dem = 0;
        while(ss >> tmp){
            dem ++;
            if((tmp[tmp.size()-1]-'0')%2==0) chan++;
            else le++;
        }
        if ((chan > le && dem%2==0)||(le > chan && dem%2!=0)) cout << "YES" << endl;
        else cout << "NO" << endl;
    }
}