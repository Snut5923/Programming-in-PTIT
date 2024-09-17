#include<bits/stdc++.h>
using namespace std;
struct sv{
	string ma,ten,lop,mail;
	friend istream& operator >> (istream& in,sv& a){
		cin.ignore();
		getline(cin,a.ma);
		getline(cin,a.ten);
		cin >> a.lop >> a.mail;
		return in;
	}
	friend ostream& operator << (ostream& out,sv a){
		out << a.ma << " " << a.ten << " " << a.lop << " " << a.mail << endl;
		return out;
	}
	string getnam(){
		return "20"+lop.substr(1,2);
	}
};
int main(){
	int n;
	cin >> n;
	sv a[n];
	for(int i=0;i<n;i++) cin >> a[i];
	int t;
	cin >> t;
	vector<string> v;
	for(int i=0;i<t;i++){
		string s;
		cin >> s;
		v.push_back(s);
		cout << "DANH SACH SINH VIEN KHOA " + s +":" << endl;
		for(auto i : a){
			if(i.getnam() == s) cout << i;
		}
	}
//	for(string s : v){
//		cout << "DANH SACH SINH VIEN KHOA " + s +":" << endl;
//		for(auto i : a){
//			if(i.getnam() == s) cout << i;
//		}
//	}
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//2015
