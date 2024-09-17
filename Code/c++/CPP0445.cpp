#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        multiset<int> s;
        while(n--){
            int x;
            cin >> x;
            s.insert(x);
        }
        int min1 = *s.begin();
        int min2 = *(++s.begin());
        if(min1 == min2 || s.size()==1) cout << "-1" << endl;
        else cout << min1 << " " << min2 << endl;
    }
}
