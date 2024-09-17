#include<bits/stdc++.h>
using namespace std;
struct SinhVien{
    string ten,ma,ngay;
    double gpa;
};
void nhap(SinhVien& x){
    getline(cin,x.ten);
    cin >> x.ma >> x.ngay >> x.gpa;
}
void in(SinhVien x){
    string kq = "";
    string tmp = "";
    for(auto i : x.ngay){
        if(i!='/'){
            tmp += i;
        }
        else{
            if (tmp.size()==1){
                kq += '0' + tmp + '/';
            }
            else kq += tmp + '/';
            tmp = "";
        }
    }
    kq += tmp;
    cout << "B20DCCN001 " << x.ten << " " << x.ma << " " << kq << " " << fixed << setprecision(2) << x.gpa;
}
int main(){
    struct SinhVien a;
    nhap(a);
    in(a);
    return 0;
}