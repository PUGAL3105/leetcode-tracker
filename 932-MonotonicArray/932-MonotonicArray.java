// Last updated: 09/07/2026, 09:48:18
class Solution {
    public boolean isMonotonic(int[] nums) {
        int inc=1;
        int dec=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                inc=0;
            }
            if(nums[i]>nums[i-1]){
                dec=0;
            }
        }
        return inc==1||dec==1;
    }
}