#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        vector<int> v(n);
        for(int i=0;i<n;i++){
            cin >> v[i];
        }
        if(prev_permutation(v.begin(),v.end())){
            for(int i : v){
                cout << i << " ";
            }
        }
        else{
            for(int i=n;i>=1;i--) cout << i << " ";
        }
        cout << endl;
    }
}
// 2
// 5 
// 1  2  3  5  4
// 5
// 5  4  3  2  1