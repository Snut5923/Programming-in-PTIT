#include<bits/stdc++.h>
using namespace std;
int doi(string s){
	int x = 0;
	for (char i : s){
		x = x*10 + (i-'0');
	}
	return x;
}
struct phim{
	string ma,ten,date,loai;
	int tap,d,m,y;
	void in(){
		cout << ma << " " << loai << " " << date << " " << ten << " " << tap << endl;
		
	}
};
void nhap(phim& a,int i,map<string,string> mp){
	string x = "P";
	if(i < 10) x += "00" + to_string(i);
	else if(i < 100) x += "0" + to_string(i);
	else x += to_string(i);
	a.ma = x;
	string matl;
	cin >> matl;
	a.loai = mp[matl];
	cin >> a.date;
	cin.ignore();
	getline(cin,a.ten);
	cin >> a.tap;
	stringstream ss(a.date);
	string tmp;
	vector<string> v;
	while(getline(ss,tmp,'/')) v.push_back(tmp);
	a.d = doi(v[0]);
	a.m = doi(v[1]);
	a.y = doi(v[2]);
}
bool cmp(phim a,phim b){
	if(a.y != b.y) return a.y < b.y;
	else if(a.m != b.m) return a.m < b.m;
	else if(a.d != b.d) return a.d < b.d;
	else if(a.ten != b.ten) return a.ten < b.ten;
	else return a.tap > b.tap;
}
int main(){
	map<string,string> mp;
	int n,m;
	cin >> n >> m;
	cin.ignore();
	for(int i=1;i<=n;i++){
		string x = "TL";
		if(i < 10) x += "00" + to_string(i);
		else if(i < 100) x += "0" + to_string(i);
		else x += to_string(i);
		string y;
		getline(cin,y);
		mp[x] = y;
	}
	phim a[m];
	for(int i=0;i<m;i++){
		nhap(a[i],i+1,mp);
	}
	sort(a,a+m,cmp);
	for(auto i : a) i.in();
}
