#include<bits/stdc++.h>
using namespace std;
int main(){
    string a,b;
    getline(cin,a);
    getline(cin,b);
    int x = a.find(b);
    int n = b.size();
    a.erase(x,n);
    int ok = 0;
    for(int i : a){
        if(i != ' ' && ok == 0){
            ok = 1;
            cout << char(i);
        }
        else if(ok==1) cout << char(i);
    }
}