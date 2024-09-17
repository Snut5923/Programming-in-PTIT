#include<bits/stdc++.h>
using namespace std;
string doi(string s){
    string x = "" + s[2] + s[0] + s[1];
    return x;
}
int main(){
	string s = "heTfl g as iicpCTo.7F4NRP051N5_16_35P3X51N3_V9AAB1F8.7";
    vector<string> v;
    int dem = 0;
    string tmp = "";
    for(auto i : s){
        tmp += i;
        dem++;
        if(dem==3){
            v.push_back(doi(tmp));
            tmp = "";
            dem = 0;
        }
    }
    for(auto i : v) cout << i;
}