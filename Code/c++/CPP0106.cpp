#include<bits/stdc++.h>
using namespace std;
bool check(string s){
	int l = 0;
	int r = s.size()-1;
	while(l < r){
		if (s[l] != s[r]) return false;
		l += 1;
		r -= 1;
	}
	return true;
}
int main(){
    int t;
    cin >> t;
    for(int i=0;i<t;i++){
        string s;
        cin >> s;
        if (check(s)) cout << "YES" << endl;
        else cout << "NO" << endl;
    }   
    return 0;
}

