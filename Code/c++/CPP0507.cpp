#include<bits/stdc++.h>
using namespace std;
using ll = long long;
struct PhanSo{
    ll ts,ms;
};
void nhap(PhanSo& x){
    cin >> x.ts >> x.ms;
}
ll ucln(ll a,ll b){
    while(b){
        ll r = a%b;
        a = b;
        b = r;
    }
    return a;
}
PhanSo tong(PhanSo a,PhanSo b){
    PhanSo x;
    ll t = a.ts*b.ms+a.ms*b.ts;
    ll m = a.ms*b.ms;
    ll u = ucln(t,m);
    t /= u;
    m /= u;
    x.ts = t;
    x.ms = m;
    return x;
}
void in(PhanSo x){
    cout << x.ts << "/" << x.ms;
}
int main() {
	struct PhanSo p,q;
	nhap(p); nhap(q);
	PhanSo t = tong(p,q);
	in(t);
	return 0;
}