#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    for(int i=0;i<t;i++){
        char c;
        cin >> c;
        if (islower(c)){
        	cout << char(toupper(c)) << endl;
		}
		else{
			cout << char(tolower(c)) << endl;
		}
    }   
    return 0;
}

