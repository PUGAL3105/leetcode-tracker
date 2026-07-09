// Last updated: 09/07/2026, 09:47:41
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]= nums[i]+nums[i-1];
        }
        return nums;
    }
}