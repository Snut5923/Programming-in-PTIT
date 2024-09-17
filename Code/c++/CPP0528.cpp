#include<bits/stdc++.h>
using namespace std;
struct intern{
    string stt,ma,ten,lop,mail,dn;
    string getdn(){
        return dn;
    }
    void in(){
        cout << stt << " " << ma << " " << ten << " " << lop << " " << mail << " " << dn << endl;
    }
};
void nhap(intern& a,int i){
    cin.ignore();
    a.stt = to_string(i);
    getline(cin,a.ma);
    getline(cin,a.ten);
    cin >> a.lop >> a.mail >> a.dn;
}
bool cmp(intern a,intern b){
    return a.ten < b.ten;
}
int main(){
    int n;
    cin >> n;
    struct intern a[n];
    for(int i=0;i<n;i++){
        nhap(a[i],i+1);
    }
    sort(a,a+n,cmp);
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        for(auto i : a){
            if(i.getdn() == s){
                i.in();
            }
        }
    }
}