#include<bits/stdc++.h>
using namespace std;
string chuanhoa(string s){
    stringstream ss(s);
    string tmp;
    string x = "";
    while(ss >> tmp){
        tmp[0] = toupper(tmp[0]);
        for(int i=1;i<tmp.size();i++){
            tmp[i] = tolower(tmp[i]);
        }
        x += tmp + " ";
    }
    return x;
}
int main(){
    ifstream input;
    input.open("DATA.in");
    string s;
    while(getline(input,s)){
        if(s=="END") break;
        else cout << chuanhoa(s) << endl;
    }
}