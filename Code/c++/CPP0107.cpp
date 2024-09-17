#include<bits/stdc++.h>
#include <string>
using namespace std;
int main(){
	string de101 = "ABBADCCABDCCABD";
	string de102 = "ACCABCDDBBCDDBB";
    int t;
    cin >> t;
    for(int i=0;i<t;i++){
        string de;
        double dung = 0;
        string a[16];
        for (int i=0;i<16;i++){
        	cin >> a[i];	
		}
		if (a[0] == "101") de = de101;
		else de = de102;
		for (int j=1;j<16;j++){
			if (a[j][0] == de[j-1]) dung +=1;
		}
		cout << fixed << setprecision(2) << (double)(dung*10/15)<< endl; 
    }   
    return 0;
}

