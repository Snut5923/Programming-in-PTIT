#include<bits/stdc++.h>
#include <string>
using namespace std;
bool check(string s){
	int dem = 0;
	for (char i : s){
		if ((i-'0')%2==0){
			dem += 1;
		}
	}
	return dem*2 == s.size();
}
int main(){
	int n;
	cin >> n;
	long x = pow(10,n)-1;
	int dem = 0;
	for (long i = pow(10,n-1); i <= x ;i++){
		string s = to_string(i);
		if (s.size()%2==0 && check(s)){
			dem += 1;
			if (dem < 10){
				cout << s << " ";
			}
			if (dem == 10){
				cout << s << endl;
				dem = 0;
			}
		}		
	}
    return 0;
}

