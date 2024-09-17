#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t-->0){
        double xa,ya,xb,yb;
        cin >> xa >> ya >> xb >> yb;
        double d = (double)sqrt(pow((xa-xb),2) + pow((ya-yb),2));
        cout << fixed << setprecision(4) << d << endl;
    }
}