#include<bits/stdc++.h>
using namespace std;
struct ThiSinh{
    string hoten;
    string ngaysinh;
    double diem1,diem2,diem3,tong;
};
void nhap(ThiSinh& x){
    getline(cin,x.hoten);
    cin >> x.ngaysinh >> x.diem1 >> x.diem2 >> x.diem3;
    cin.ignore();
    x.tong = x.diem1 + x.diem2 + x.diem3;
}
void in(ThiSinh x){
    cout << x.hoten << " " << x.ngaysinh << " " << fixed << setprecision(1) << x.tong;
}
int main(){
    struct ThiSinh A;
    nhap(A);
    in(A);
    return 0;
}