#include<bits/stdc++.h>
using namespace std;
struct sv{
    string ma,ten,lop,mail;
    void in(){
        cout << ma << " " << ten << " " << lop << " " << mail << endl;
    }
};
void nhap(sv& a){
    cin.ignore();
    getline(cin,a.ma);
    getline(cin,a.ten);
    cin >> a.lop >> a.mail;
}
bool cmp(sv a,sv b){
    if(a.lop != b.lop) return a.lop < b.lop;
    return a.ma < b.ma;
}
int main(){
    int n;
    cin >> n;
    sv a[n];
    for(int i=0;i<n;i++) nhap(a[i]);
    sort(a,a+n,cmp);
    for(auto i : a) i.in();
}