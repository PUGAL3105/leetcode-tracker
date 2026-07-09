// Last updated: 09/07/2026, 09:48:39
class Solution {
    public int pivotIndex(int[] nums) {
       int l=0;
       int s=0;
       for(int i=0;i<nums.length;i++){
        s +=nums[i];
       }
       for(int i=0;i<nums.length;i++){
        int r=s-l-nums[i];
        if(l==r){
            return i;
        }
        l +=nums[i];
       }
       return -1;
        
    }   
}