#include<bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin >> t;
	while(t-->0){
		string s;
		cin >> s;
		string x = "084";
		s.erase(s.find(x),x.size());
		cout << s << endl;
	}
}
