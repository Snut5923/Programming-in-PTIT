#include<bits/stdc++.h>
using namespace std;
struct nguoi
{
    string ten,dob;
    string ngay,thang,nam;
    int d,m,y;
    void tach(){
        
        d = (dob[0]-'0')*10+dob[1]-'0';
        
        m = (dob[3]-'0')*10+dob[4]-'0';
        
        y = (dob[6]-'0')*1000+(dob[7]-'0')*100+(dob[8]-'0')*10+dob[9]-'0';
    }
};
void nhap(nguoi& a){
    cin >> a.ten >> a.dob;
}
bool cmp(nguoi a,nguoi b){
    if(a.y != b.y) return a.y < b.y;
    else if(a.m != b.m) return a.m < b.m;
    return a.d < b.d;
}
int main(){
    int n;
    cin >> n;
    nguoi a[n];
    for(int i=0;i<n;i++){
        nhap(a[i]);
        a[i].tach();
    }
    sort(a,a+n,cmp);
    cout << a[n-1].ten << endl ;
    cout << a[0].ten << endl;
}
