#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        set<int> a;
        int n = s.length();
        for(char i : s){
            a.insert(i);
        }        
        int k;
        cin >> k;
        int thieu = 26 - a.size();
        if (n < 26) cout << "0" << endl;
        else{
            if(((n - a.size()) >= thieu) && (k >= thieu)){
                cout << "1" << endl;
            }
            else cout << "0" << endl;
        }

    }
}