#include<bits/stdc++.h>
using namespace std;
using ll = long long;
ll ucln(ll a,ll b){
    while(b){
        ll r = a%b;
        a = b;
        b = r;
    }
    return a;
}
struct PhanSo{
    ll ts,ms;
    PhanSo(int x,int y){
        ts = x;
        ms = y;
    }
    void rutgon(){
        ll u = ucln(ts,ms);
        ts /= u;
        ms /= u;
    }
    friend istream& operator >> (istream& i,PhanSo& p){
        i >> p.ts >> p.ms;
        return i;
    }
    friend ostream& operator << (ostream& o,PhanSo p){
        o << p.ts << "/" << p.ms;
        return o;
    }
};

int main() {
	PhanSo p(1,1);
	cin >> p;
	p.rutgon();
	cout << p;
	return 0;
}