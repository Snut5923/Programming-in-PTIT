#include<bits/stdc++.h>
#define PI 3.141592653589793238
using namespace std;
struct Point{
    double x,y;
    double d(Point a){
        return sqrt((x-a.x)*(x-a.x) + (y-a.y)*(y-a.y));
    }
};
void nhap(Point& a){
    cin >> a.x >> a.y;
}
bool check(double a,double b,double c){
    return a+b>c && a+c>b && b+c>a;
}
double R(double a,double b,double c){
    double s =  sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b));
    return a*b*c/s;
}

int main(){
    int t;
    cin >> t;
    while(t--){
        Point A,B,C;
        nhap(A); nhap(B); nhap(C);
        double a = A.d(B);
        double b = A.d(C);
        double c = B.d(C);
        if(check(a,b,c)){
            double r = R(a,b,c);
            double s = PI * r * r;
            cout << fixed << setprecision(3) << s << endl;
        }
        else cout << "INVALID" << endl;
    }
}