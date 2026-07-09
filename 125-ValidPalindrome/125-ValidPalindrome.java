// Last updated: 09/07/2026, 09:51:33
class Solution {
    public boolean isPalindrome(String s) {
   s = s.toLowerCase().replaceAll("[^a-z0-9]","");
     int a=0;
     int b = s.length()-1;
     while(a<b)
     {
        if(s.charAt(a) != s.charAt(b)){
        return false;
     }
     a++;
     b--;
    }
    return true;
    }
}