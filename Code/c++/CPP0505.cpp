#include<bits/stdc++.h>
using namespace std;
struct NhanVien{
    string ten,ma,gioitinh,dob,diachi,thue,ky;
};
void nhap(NhanVien& x){
    x.ma = "00001";
    getline(cin,x.ten);
    cin >> x.gioitinh;
    cin >> x.dob;
    cin.ignore();
    getline(cin,x.diachi);
    cin >> x.thue;
    cin >> x.ky;
}
void in(NhanVien x){
    cout << x.ma << " " << x.ten << " " << x.gioitinh << " " << x.dob << " " << x.diachi << " " << x.thue << " " << x.ky;
}
int main(){
    struct NhanVien a;
    nhap(a);
    in(a);
    return 0;
}