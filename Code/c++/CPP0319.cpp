#include<bits/stdc++.h>
using namespace std;
int main(){
    int m,s;
    cin >> m >> s;
    if(s > m*9 || s == 0){
        cout << "-1 -1";
    }
    else{
        int r = s;
        int a = m;
        string str = "";
        while(a--){
            if(s>9){
                str += '9';
                s -= 9;
            }
            else break;
        }
        if(a >= 0){
            if(a == 0){
                str += to_string(s);
            }
            else{
                str+= to_string(s-1);
                a-=1;
                while(a--){
                    str+='0';
                }
                str += '1';
            }
        }
        for(int i=m-1;i>=0;i--){
            cout << str[i];
        }
        cout << " ";
        str = "";
        a = m;
        while(a--){
            if(r>9){
                str += '9';
                r -= 9;
            }
            else break;
        }
        if(a>=0){
            if(a==0){
                str += to_string(r);
            }
            else{
                str += to_string(r);
                while(a--){
                    str += '0';
                }
            }
        }
        cout << str;
    }
}