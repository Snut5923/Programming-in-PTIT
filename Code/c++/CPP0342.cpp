#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        multiset<char> a;
        int res = 0;
        int tmp = 0;
        for(char i : s){
            if(isdigit(i)){
                tmp += i - '0';
            }
            else{
                a.insert(i);
                res += tmp;
                tmp = 0;
            }
        }
        res += tmp;
        for(char i : a){
            cout << i;
        }
        cout << res << endl;
    }
}