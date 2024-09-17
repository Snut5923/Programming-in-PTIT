#include<bits/stdc++.h>
using namespace std;
struct PhanSo
{
    long long tu,mau;
    PhanSo(){
        tu = 1;
        mau = 1;
    }
    PhanSo(long long t,long long m){
        tu = t;
        mau = m;
    }
    PhanSo cong(PhanSo B){
        long long t = tu * B.mau + mau* B.tu;
        t *= t;
        long long m = mau * B.mau;
        m *= m;
        long long u = __gcd(t,m);
        t/=u;
        m/=u;
        return PhanSo(t,m);
    }
    PhanSo nhan(PhanSo B){
        long long t = tu*B.tu;
        long long m = mau*B.mau;
        long long u = __gcd(t,m);
        return PhanSo(t/u,m/u);
    }
    void in(){
        cout << tu << "/" << mau << " ";
    }
};

void process(PhanSo A,PhanSo B){
    PhanSo C = A.cong(B);
    PhanSo D = (A.nhan(B)).nhan(C);
    C.in();
    D.in();
    cout <<endl;
}
int main() {
	int t;
	cin >> t;
	while (t--) {
		PhanSo A;
		PhanSo B;
		cin >> A.tu >> A.mau >> B.tu >> B.mau;
		process(A, B);
	}
}