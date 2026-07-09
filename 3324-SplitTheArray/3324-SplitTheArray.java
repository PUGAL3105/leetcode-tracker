// Last updated: 09/07/2026, 09:47:05
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int c[]=new int[101];
        for(int n : nums){
            c[n]++;
            if(c[n]>2){
                return false;
            }
        }
        return true;
    }
}