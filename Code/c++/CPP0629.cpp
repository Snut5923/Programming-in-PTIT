#include<bits/stdc++.h>
using namespace std;
struct cty{
	string ma,ten;
	int sl;
	friend istream& operator >> (istream& in,cty& a){
		in >> a.ma;
		cin.ignore();
		getline(in,a.ten);
		in >> a.sl;
		return in;
	}
	friend ostream& operator << (ostream& out,cty a){
		out << a.ma << " " << a.ten << " " << a.sl << endl;
		return out;
	}
	int getsl(){
		return sl;
	}
};
bool cmp(cty a,cty b){
	if(a.sl != b.sl) return a.sl > b.sl;
	return a.ma < b.ma;
}
int main(){
	int n;
	cin >> n;
	cty a[n];
	for(int i=0;i<n;i++) cin >> a[i];
	sort(a,a+n,cmp);
	int t;
	cin >> t;
	while(t--){
		int l,r;
		cin >> l >> r;
		cout << "DANH SACH DOANH NGHIEP NHAN TU " + to_string(l) + " DEN " + to_string(r)+ " SINH VIEN:" << endl;
		for(auto i : a){
			int x = i.getsl();
			if(x>=l && x<=r) cout << i;
		}
	}
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//1
//30 50

