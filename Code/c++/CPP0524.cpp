#include<bits/stdc++.h>
using namespace std;
struct SinhVien{
    string ma,ten,lop;
    float diem1,diem2,diem3;
    void in(int n){
        cout << n << " " << ma << " " << ten << " " << lop << " ";
        cout << fixed << setprecision(1) << diem1 << " " << diem2 << " " << diem3 << endl;
    }

};
void nhap(SinhVien& a){
    cin.ignore();
    getline(cin,a.ma);
    getline(cin,a.ten);
    getline(cin,a.lop);
    cin >> a.diem1 >> a.diem2 >> a.diem3;
}
bool cmp(SinhVien a,SinhVien b){
    return a.ma < b.ma;
}
void sap_xep(SinhVien ds[],int n){
    sort(ds,ds+n,cmp);
}
void in_ds(SinhVien ds[],int n){
    for(int i=0;i<n;i++){
        ds[i].in(i+1);
    }
}
int main(){
    int n;
    cin >> n;
    struct SinhVien *ds = new SinhVien[n];
    for(int i = 0; i < n; i++) {
    	nhap(ds[i]);
	}
	sap_xep(ds, n);
    in_ds(ds,n);
    return 0;
}
