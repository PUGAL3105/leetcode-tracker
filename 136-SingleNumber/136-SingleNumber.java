// Last updated: 09/07/2026, 09:51:27
class Solution {
    public int singleNumber(int[] nums) {
     int res = 0;
     for( int n : nums)
     {
        res ^= n;
     }
     return res;
    }
}