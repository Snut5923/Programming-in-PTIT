#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    for(int i=0;i<t;i++){
    	int ok = 0;
        string s;
        cin >> s;
        for (auto i : s){
        	if (i != '6' && i!='8' && i!='0'){
        		ok = 1;
        		break;
			} 
		}
		if (ok==0){
			cout << "YES" << endl;
		}
		else cout << "NO" << endl;
		
    }   
    return 0;
}

