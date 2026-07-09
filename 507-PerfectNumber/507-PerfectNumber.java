// Last updated: 09/07/2026, 09:48:57
class Solution {
    public boolean checkPerfectNumber(int num) {
     int sum =0;
     for(int i=1;i<num;i++)
     {
        if(num% i==0)
        {
            sum +=i;
        }
     }
     if(num == sum)
     return true;
     return false;
        
    }
}