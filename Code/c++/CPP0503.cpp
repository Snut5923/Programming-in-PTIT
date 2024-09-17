#include<bits/stdc++.h>
using namespace std;
struct PhanSo{
    long long ts,ms;
};
long long ucln(long long a,long long b){
    while(b){
        long long r = a%b;
        a = b;
        b = r;
    }
    return a;
}
void nhap(PhanSo& p){
    cin >> p.ts >> p.ms;
}
void rutgon(PhanSo& p){
    long long x = ucln(p.ts,p.ms);
    p.ts /= x;
    p.ms /= x;
}
void in(PhanSo p){
    cout << p.ts << "/" << p.ms;
}
int main() {
	struct PhanSo p;
	nhap(p);
	rutgon(p);
	in(p);
	return 0;
}