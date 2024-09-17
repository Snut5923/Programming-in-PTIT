#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    long long x = 1;
    long long s = 0;
    for (int i=1;i<=n;i++){
    	x *= i;
    	s += x;
	}
	cout << s ;
    return 0;
}

