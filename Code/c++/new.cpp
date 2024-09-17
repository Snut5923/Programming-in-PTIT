#include<bits/stdc++.h>
using namespace std;
string doi(string s){
    string x = "" + s[2] + s[0] + s[1];
    return x;
}
int main(){
	ifstream in;
    in.open("text.txt");
    string s;
    vector<string> v;
    while(getline(in,s)){
        v.push_back(s);
    }
    
    ofstream out;
    out.open("a.txt");
    for(string i : v){
    	out << i << endl;
	}
    
}
