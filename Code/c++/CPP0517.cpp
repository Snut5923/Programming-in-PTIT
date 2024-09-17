#include<bits/stdc++.h>
using namespace std;
struct NhanVien{
    string ma,ten,gt,dob,dc,thue,ky;
};
void nhap(NhanVien& x){
    cin.ignore();
    getline(cin,x.ten);
    cin >> x.gt >> x.dob;
    cin.ignore();
    getline(cin,x.dc);
    cin >> x.thue >> x.ky;
}
void inds(NhanVien ds[],int N){
    for(int i=1;i<=N;i++){
        NhanVien x = ds[i-1];
        if(i < 10) cout << "0000"+to_string(i) << " ";
        else cout << "000"+to_string(i) << " ";
        cout << x.ten << " " << x.gt << " " << x.dob << " " << x.dc << " " << x.thue << " " << x.ky << endl;
    }
}
int main(){
    struct NhanVien ds[50];
    int N,i;
    cin >> N;
    for(i = 0; i < N; i++) nhap(ds[i]);
    inds(ds,N);
    return 0;
}