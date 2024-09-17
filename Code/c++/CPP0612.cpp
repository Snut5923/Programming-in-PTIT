#include<bits/stdc++.h>
using namespace std;
int idx = 1;
string chuanhoa(string s){
    string kq = "";
    string tmp = "";
    for(char i : s){
        if(i != '/'){
            tmp += i;
        }
        else{
            if(tmp.size() <2) kq += '0' + tmp + '/';
            else kq += tmp + '/';
            tmp = "";
        }
    }
    kq += tmp;
    return kq;
}
string convert(string s){
    string kq = "";
    stringstream ss(s);
    string tmp;
    while(ss >> tmp){
        tmp[0] = toupper(tmp[0]);
        for(int i=1;i<tmp.size();i++){
            tmp[i] = tolower(tmp[i]);
        }
        kq += tmp + " ";
    }
    return kq;
}
struct SinhVien
{
    string ma = "B20DCCN";
    string ten,lop,dob;
    double gpa;
    friend istream& operator >> (istream& in,SinhVien& a){
        in.ignore();
        if(idx < 10) a.ma += "00" + to_string(idx);
        else a.ma += "0" + to_string(idx);
        idx++;
        getline(in,a.ten);
        a.ten = convert(a.ten);
        cin >> a.lop >> a.dob >> a.gpa;
        a.dob = chuanhoa(a.dob);
        return in;
    }
    friend ostream& operator << (ostream& out,SinhVien a){
        cout << a.ma << " " << a.ten  << a.lop << " " << a.dob << " " << fixed << setprecision(2) << a.gpa << endl;
        return out;
    }
};

int main(){
    SinhVien ds[50];
    int N, i;
    cin >> N;
    for(i=0;i<N;i++){
        cin >> ds[i];
    }
    for(i=0;i<N;i++){
        cout << ds[i];
    }
    return 0;
}