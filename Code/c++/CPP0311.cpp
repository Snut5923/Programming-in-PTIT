#include<bits/stdc++.h> 
using namespace std; 
int main(){ 
    int t;cin>>t; 
    while(t--){ 
        map<char,int> mp; 
        string s;
        cin>>s; 
        int res=0; 
        for(char x:s){ 
            mp[x]++; 
            if(mp[x]>=res) res=mp[x]; 
        } 
        int k=res - (s.size()-res); 
        if(k >= 2 ) cout<<"0\n"; 
        else cout<<"1\n"; 
    } 
}