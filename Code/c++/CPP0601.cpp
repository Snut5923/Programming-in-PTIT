#include<bits/stdc++.h>
using namespace std;
struct SinhVien{
    string ten,lop,dob;
    string ma = "B20DCCN001";
    double gpa;
    void nhap(){
        getline(cin,ten);
        cin >> lop;
        cin >> dob;
        cin >> gpa;
    }
    void xuat(){
        string s = "";
        string tmp = "";
        for(char i : dob){
            if(i!='/'){
                tmp += i;
            }
            else{
                if(tmp.size()!=2){
                    s += '0' + tmp + '/';
                }
                else s += tmp + '/';
                tmp ="";
            }
        }
        s += tmp;
        cout << ma << " " << ten << " " << lop << " " << s << " " << fixed << setprecision(2) << gpa;

    }
};

int main(){
    SinhVien a;
    a.nhap();
    a.xuat();
    return 0;
}