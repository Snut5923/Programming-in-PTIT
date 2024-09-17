#include<bits/stdc++.h>
using namespace std;
string lower(string s){
	string x = "";
	for(int i=0;i<s.size();i++){
		if(isalpha(s[i])){
			char y = tolower(s[i]);
			x += y;
		}
		else x += s[i];
	}
	return x;
}
int main(){
	ifstream in1;
	in1.open("DATA1.in");
	map<string,int> mp;
	string s;
	set<string> hop;
	set<string> giao;
	while(getline(in1,s)){
		stringstream ss(s);
		string tmp;
		while(ss >> tmp){
			tmp = lower(tmp);
			mp[tmp] = 1;
			hop.insert(tmp);
		}
	}
	
	ifstream in2;
	in2.open("DATA2.in");
	while(getline(in2,s)){
		stringstream ss(s);
		string tmp;
		while(ss >> tmp){
			tmp = lower(tmp);
			if(mp[tmp]==1) giao.insert(tmp);
			hop.insert(tmp);
		}
	}
	
	for(auto i : hop) cout << i << " ";
	cout << endl;
	for(auto i : giao) cout << i << " ";
}
