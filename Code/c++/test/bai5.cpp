#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    char a[10];
    char b[10];
    for(int i=0;i<10;i++){
        a[i] = 'A' + i;
        b[i] = 'K' + i;
    }
    while(t--){
        string x,y;
        string s1 ="";
        string s2 = "";
        cin >> x >> y;
        for(char i : x){
            s1 += a[i - '0'] ;
            s2 += b[i - '0'] ;
        }
        string check ="";
        for(char i : y){
            if(!isdigit(i)) check += i;
        }
        cout << s1 << " "<<  s2<< " " << check << endl; 
        if(check == s1 || check == s2) cout << "YES" << endl;
        else cout << "NO" << endl;
    }
}
