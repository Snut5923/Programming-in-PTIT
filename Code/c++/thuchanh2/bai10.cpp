#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int a[n];
		ll sum[n+1];
		sum[0] = 0;
		for(int i=1;i<=n;i++){
			int x;
			cin >> x;
			sum[i] = x + sum[i-1];
		}
		int ok = 0;
		for(int i=1;i<=n;i++){
			if(sum[i-1] == sum[n] - sum[i]){
				cout << i << endl;
				ok = 1;
				break;
			}
		}
		if (ok==0) cout << -1 << endl;
	}
}
//2
//7
//-7 1 5 2 -4 3 0
//5
//1 2 3 4 5
