#include<bits/stdc++.h>
using namespace std;
struct SinhVien{
    string ma = "N20DCCN001";
    string ten,lop,ns;
    double gpa;
};
void nhapThongTinSV(SinhVien& a){
    getline(cin,a.ten);
    cin >> a.lop >> a.ns >> a.gpa;
}
void inThongTinSV(SinhVien a){
    string s = "";
    string tmp = "";
    string x = a.ns;
    for(int i=0;i<x.size();i++){
        if(x[i]!='/'){
            tmp += x[i];
        }
        else{
            if(tmp.size() < 2) s += "0" + tmp + "/";
            else s += tmp + "/";
            tmp = "";
        }
    }
    s += tmp;
    cout << a.ma << " " << a.ten << " " << a.lop << " " << s << " " << fixed << setprecision(2) << a.gpa;
}
int main(){
    struct SinhVien a;
    nhapThongTinSV(a);
    inThongTinSV(a);
    return 0;
}