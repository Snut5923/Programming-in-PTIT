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
    PhanSo(ll x,ll y){
        ts = x;
        ms = y;
    }
    friend istream& operator >> (istream& i,PhanSo& a){
        i >> a.ts >> a.ms;
        return i;
    }
    friend ostream& operator << (ostream& o,PhanSo a){
        o << a.ts << "/" << a.ms;
        return o;
    }
    friend PhanSo operator + (PhanSo a,PhanSo b){
        ll t = a.ts*b.ms + a.ms*b.ts;
        ll m = a.ms*b.ms;
        ll u = ucln(t,m);
        t/=u;
        m/=u;
        return PhanSo(t,m);
    }
};

int main() {
	PhanSo p(1,1), q(1,1);
	cin >> p >> q;
	cout << p + q;
	return 0;
}