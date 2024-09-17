#include<bits/stdc++.h>
using namespace std;
struct lienlac{
	string ten,sdt,ngay;
	string hodem,name;
	lienlac(string a,string b,string c){
		ten = a;
		sdt = b;
		ngay = c;
		stringstream ss(ten);
		vector<string> vt;
		string tmp;
		while(ss >> tmp) vt.push_back(tmp);
		hodem = "";
		for(int i=0;i<vt.size()-1;i++) hodem += vt[i] + " ";
		hodem = hodem.substr(0,hodem.size()-1);
		name = vt[vt.size()-1];
	}
	string in(){
		return ten +": "+sdt+" "+ ngay;
	}
};
bool cmp(lienlac a,lienlac b){
	if(a.name != b.name) return a.name < b.name;
	else return a.hodem < b.hodem;
}
int main(){
	ifstream file;
	ofstream out;
	file.open("SOTAY.txt");
	string s;
	string topic="";
	map<string,vector<string>> kq;
	while(getline(file,s)){
		string x = s.substr(0,4);
		if(x == "Ngay"){
			stringstream ss(s);
			string tmp;
			vector<string> v;
			while(ss >> tmp) v.push_back(tmp);
			topic = v[1];
		}
		else{
			kq[topic].push_back(s);
		}
	}
	vector<lienlac> v;
	for (auto i : kq){
		int j = 0;
		while(j<i.second.size()){
			v.push_back(lienlac(i.second[j],i.second[j+1],i.first));
			j+=2;
		}
	}
	sort(v.begin(),v.end(),cmp);
	out.open("DIENTHOAI.txt");
	for(auto i : v){
		out << i.in() << endl;
	}
	out.close();
}
