#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool isPalindrome(int x) {
        long temp=x;
        long long rev=0;
        if(temp<0)  temp*=-1;
        while (temp) {
    
            rev = rev * 10 +temp%10;
            temp/= 10;
        }
        
      return rev==x;
    }
    
};