#include<bits/stdc++.h>
using namespace std;
struct ptit{
    int ma,share,tt,diem;
    int d(){
        return diem;
    }
    void in(){
        cout << ma << " ";
    }
};
void nhap(ptit& a){
    cin >> a.ma >> a.share >> a.tt;
    a.diem = a.share*7 + a.tt*3;
}
bool cmp(ptit a,ptit b){
    if(a.diem != b.diem) return a.diem > b.diem;
    else return a.ma < b.ma;
}
int main(){
    int n;
    cin >> n;
    ptit a[n];
    ptit b[n];
    for(int i=0;i<n;i++){
        nhap(a[i]);
        b[i] = a[i];
    }
    sort(a,a+n,cmp);
    int res = a[6].d();
    for(int i=0;i<n;i++){
        if(res <= b[i].d()) b[i].in();
    }
}
