#include<bits/stdc++.h>
using namespace std;
struct NhanVien{
    string ma = "00001";
    string ten,gt,ns,dc,thue,ky;
    friend istream& operator >> (istream& i,NhanVien& a){
        getline(i,a.ten);
        i >> a.gt >> a.ns;
        cin.ignore();
        getline(i,a.dc);
        cin >> a.thue >> a.ky;
        return i;
    }
    friend ostream& operator >> (ostream& o,NhanVien a){
        o << a.ma << " " << a.ten << " "<< a.gt << " " << a.ns << " " << a.dc << " " << a.thue << " " << a.ky;
        return o;
    }
};

int main(){
    NhanVien a;
    cin >> a;
    cout >> a;
    return 0;
}