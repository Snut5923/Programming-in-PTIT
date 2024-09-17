#include<bits/stdc++.h>
using namespace std;
string kq(int d,int m){
    if((m==3 && d >= 21 && d <= 31) || (m==4 && d >= 1 && d <= 19)) return "Bach Duong";
    if((m==4 && d >= 20 && d <= 30) || (m==5 && d >= 1 && d <= 20)) return "Kim Nguu";
    if((m==5 && d >= 21 && d <= 31) || (m==6 && d >= 1 && d <= 20)) return "Song Tu";
    if((m==6 && d >= 21 && d <= 30) || (m==7 && d >= 1 && d <= 22)) return "Cu Giai";
    if((m==7 && d >= 23 && d <= 31) || (m==8 && d >= 1 && d <= 22)) return "Su Tu";
    if((m==8 && d >= 23 && d <= 31) || (m==9 && d >= 1 && d <= 22)) return "Xu Nu";
    if((m==9 && d >= 23 && d <= 30) || (m==10 && d >= 1 && d <= 22)) return "Thien Binh";
    if((m==10 && d >= 23 && d <= 31) || (m==11 && d >= 1 && d <= 22)) return "Thien Yet";
    if((m==11 && d >= 23 && d <= 30) || (m==12 && d >= 1 && d <= 21)) return "Nhan Ma";
    if((m==12 && d >= 22 && d <= 31) || (m==1 && d >= 1 && d <= 19)) return "Ma Ket";
    if((m==1 && d >= 20 && d <= 31) || (m==2 && d >= 1 && d <= 18)) return "Bao Binh";
    if((m==2 && d >= 19 && d <= 29) || (m==3 && d >= 1 && d <= 20)) return "Song Ngu";
}
int main(){
    int t;
    cin >> t;
    while(t--){
        int d,m;
        cin >> d >> m;
        cout << kq(d,m) << endl;
    }
}