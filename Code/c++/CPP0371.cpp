#include<bits/stdc++.h>
using namespace std;
bool check(char c){
    string s = "aeiouyAEIOUY";
    int x = s.find(c);
    return (x < 0 ) || (x > 11);
}
int main(){
    string s;
    cin >> s;
    for(auto i : s){
        if (check(i)) cout << "." << char(tolower(i));
    }
}