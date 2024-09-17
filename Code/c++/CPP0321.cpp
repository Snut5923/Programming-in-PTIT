#include<bits/stdc++.h>
using namespace std;
bool sosanh(string a,string b){
    int ok = 0;
    for(int i=0;i<a.size();i++){
        if(a[i]!=b[i]){
            if(a[i]-b[i] > 0) return true;
            else return false;
        }
    }
}
void tru(string lon,string be){
    int n = lon.size() - 1;
    string kq = "";
    int nho = 0;
    while(n>=0){
        int x = lon[n] - '0';
        int y = (be[n] - '0') + nho;
        if(x >= y){
            kq = to_string(x-y) + kq;
            nho = 0;
        }
        else{
            x += 10;
            kq = to_string(x-y) + kq;
            nho = 1;
        }
        n--;
    }
    cout << kq << endl;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        string a,b;
        cin >> a >> b;
        string lon,be;
        if(a.size()!=b.size()){
            if(a.size() < b.size()){
                lon = b;
                be = a;
            }
            else{
                lon = a;
                be = b;
            }
        }
        else{
            if(sosanh(a,b)){
                lon = a;
                be = b;
            }
            else{
                lon = b;
                be = a;
            }
        }
        int d = lon.size() - be.size();
        while(d--){
            be = '0' + be;
        }
        tru(lon,be);
    }
}