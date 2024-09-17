#include<bits/stdc++.h>
using namespace std;
struct SinhVien{
    string ma = "B20DCCN001";
    string ten,lop,dob;
    double gpa;
    friend istream& operator >>(istream& i,SinhVien& a){
        getline(i,a.ten);
        i >> a.lop >> a.dob >> a.gpa;
        return i;
    }
    friend ostream& operator <<(ostream& o,SinhVien& a){
        string s = "";
        string tmp = "";
        for(char i : a.dob){
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
        o << a.ma << " " << a.ten << " " << a.lop << " " << s << " " << fixed << setprecision(2) << a.gpa;
        return o;
    }
};


int main(){
    SinhVien a;
    cin >> a;
    cout << a;
    return 0;
}