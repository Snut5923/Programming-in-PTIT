#include<bits/stdc++.h>
using namespace std;
void cong(string lon,string be,int n){
    n -= 1;
    string kq = "";
    int nho = 0;
    int m = be.size() - 1;
    while(n>=0){
        int x = lon[n] - '0';
        int y;
        if(m >= 0) y = be[m] - '0' + nho;
        else y = nho;
        if(x+y<=9){
            kq = to_string(x+y) + kq;
            nho = 0;
        }
        else{
            kq = to_string((x+y)%10) + kq;
            nho = 1;
        }
        n--;
        m--;
    }
    if (nho!=0) kq = to_string(nho) + kq;
    cout << kq << endl;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        string a,b;
        cin >> a >> b;
        string lon,be;
        int n = max(a.size(),b.size());
        if(a.size() > b.size()){
            lon = a;
            be = b;
        }
        else{
            lon = b;
            be = a;
        }
        cong(lon,be,n);
    }
}