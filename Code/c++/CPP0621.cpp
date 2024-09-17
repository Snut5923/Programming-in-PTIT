#include<bits/stdc++.h>
using namespace std;
struct sv{
    string ma,ten,lop,mail;
    sv(string a,string b,string c,string d){
        ma = a;
        ten = b;
        lop = c;
        mail= d;
    }
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
    
    return a.ma < b.ma;
}
int main(){
    int dem = 0;
    vector<string> v;
    vector<sv> a;
    string s;
    while(getline(cin,s)){
        dem++;
        v.push_back(s);
        if(dem == 4){
            dem = 0;
            a.push_back(sv(v[0],v[1],v[2],v[3]));
            v.clear();
        }
    }
    sort(a.begin(),a.end(),cmp);
    for(auto i : a) i.in();
}