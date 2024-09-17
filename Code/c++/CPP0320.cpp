#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        if (s[0]=='0') cout << "INVALID" << endl;
        else{
            int ok = 0;
            set<char> st;
            for(char i : s){
                if(isdigit(i)){
                    st.insert(i);
                }
                else{
                    ok = 1;
                    cout << "INVALID" << endl;
                    break;
                }
            }
            if(ok==0){
                if(st.size()==10) cout << "YES" << endl;
                else cout << "NO" << endl;
            }
        }
    }
}