#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    cin.ignore();
    set<string> a;
    while(t--){
        string s;
        getline(cin,s);
        a.insert(s);
    }
    cout << a.size() << endl;
}