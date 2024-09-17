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
        string x = a.ten;
        stringstream ss(x);
        string y;
        vector<string> v;
        while(ss >> y){
            v.push_back(y);
        }
        string str = "";
        for(auto i : v){
            int n = i.size();
            str += toupper(i[0]);
            for(int j=1;j<n;j++){
                str+= tolower(i[j]);
            }
            str += " ";
        }
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
        o << a.ma << " " << str << a.lop << " " << s << " " << fixed << setprecision(2) << a.gpa;
        return o;
    }
};


int main(){
    SinhVien a;
    cin >> a;
    cout << a;
    return 0;
}