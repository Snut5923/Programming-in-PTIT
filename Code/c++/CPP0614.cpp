#include<bits/stdc++.h>
using namespace std;
int idx = 1;
struct NhanVien{
    string ma,ten,sex,dob,dc,thue,ky;
    friend istream& operator >> (istream& in,NhanVien& a){
        if(idx < 10) a.ma = "0000"+to_string(idx);
        else a.ma = "000" + to_string(idx);
        idx++;
        cin.ignore();
        getline(in,a.ten);
        getline(in,a.sex);
        getline(in,a.dob);
        getline(in,a.dc);
        cin >> a.thue >> a.ky;
        return in;
    }
    friend ostream& operator << (ostream& out,NhanVien a){
        out << a.ma << " " << a.ten << " " << a.sex << " " << a.dob << " " << a.dc << " " << a.thue << " " << a.ky << endl;
        return out;
    }
};
int main(){
    NhanVien ds[50];
    int N,i;
    cin >> N;
    for(i=0;i<N;i++) cin >> ds[i];
    for(i=0;i<N;i++) cout << ds[i];
    return 0;
}