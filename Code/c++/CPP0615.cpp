#include<bits/stdc++.h>
using namespace std;
int doi(string s){
    int res = 0;
    for(auto i : s){
        res = res * 10 + (i-'0');
    }
    return res;
}
int idx = 1;
struct NhanVien{
    string ma,ten,sex,dob,dc,thue,ky;
    int d,m,y;
    friend istream& operator >> (istream& in,NhanVien& a){
        if(idx < 10) a.ma = "0000"+to_string(idx);
        else a.ma = "000" + to_string(idx);
        idx++;
        cin.ignore();
        getline(in,a.ten);
        getline(in,a.sex);
        getline(in,a.dob);
        vector<string> v;
        stringstream ss(a.dob);
        string tmp;
        while(getline(ss,tmp,'/')){
            v.push_back(tmp);
        }
        a.d = doi(v[0]);
        a.m = doi(v[1]);
        a.y = doi(v[2]);
        getline(in,a.dc);
        cin >> a.thue >> a.ky;
        return in;
    }
    friend ostream& operator << (ostream& out,NhanVien a){
        out << a.ma << " " << a.ten << " " << a.sex << " " << a.dob << " " << a.dc << " " << a.thue << " " << a.ky << endl;
        return out;
    }
};
bool cmp(NhanVien a,NhanVien b){
    if(a.y != b.y) return a.y < b.y;
    else if(a.d != b.d) return a.d < b.d;
    return a.m < b.m;
}
void sapxep(NhanVien ds[],int n){
    sort(ds,ds+n,cmp);
}
int main(){
    NhanVien ds[50];
    int N,i;
    cin >> N;
    for(i=0;i<N;i++) cin >> ds[i];
    sapxep(ds, N);
    for(i=0;i<N;i++) cout << ds[i];
    return 0;
}