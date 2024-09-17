#include<bits/stdc++.h>
using namespace std;
float doi(float a){
    if(a >= 39) return 9.0;
    else if(a >= 37) return 8.5;
    else if(a >= 35) return 8.0;
    else if(a >= 33) return 7.5;
    else if(a >= 30) return 7.0;
    else if(a >= 27) return 6.5;
    else if(a >= 23) return 6.0;
    else if(a >= 20) return 5.5;
    else if(a >= 16) return 5.0;
    else if(a >= 13) return 4.5;
    else if(a >= 10) return 4.0;
    else if(a >= 7) return 3.5;
    else if(a >= 5) return 3.0;
    return 2.5;
}
float lamtron(float x){
    float n = x - int(x);
    if(n >= 0.75) return x - n + 1.0;
    else if(n >= 0.25) return x - n + 0.5;
    else return x - n;
}
int main(){
    int t;
    cin >> t;
    while(t--){
        float a,b,c,d;
        cin >> a >> b >> c >> d;
        float x = (doi(a) + doi(b) + c + d)/4;
        cout << fixed << setprecision(1) << lamtron(x);
        cout << endl;
    }
}
