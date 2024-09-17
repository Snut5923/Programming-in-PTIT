#include<bits/stdc++.h>
using namespace std;
string gt(char i){
    if(i=='0'||i=='1') return "";
    else if (i=='2') return "2";
    else if (i=='3') return "3";
    else if (i=='4') return "322";
    else if (i=='5') return "5";
    else if (i=='6') return "53";
    else if (i=='7') return "7";
    else if (i=='8') return "7222";
    else if (i=='9') return "7332";
}
int main(){
    int t;
    cin >> t;
    while(t--){
        string n,a;
        cin >> n >> a;
        string kq = "";
        for(auto i : a){
            kq += gt(i);
        }
        sort(kq.begin(),kq.end(),greater<char>());
        cout << kq << endl;
    }
}