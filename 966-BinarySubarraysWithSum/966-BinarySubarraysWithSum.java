// Last updated: 09/07/2026, 09:48:10
class Solution {
    public int getSubarray(int[] nums,int goal){
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;
        int n = nums.length;
        if(goal < 0){
            return 0;
        }
        while(r<n){
            sum += nums[r];
            while(sum > goal){
                sum -= nums[l];
                l++;
                
            }
            count += r - l + 1; 
            r++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return getSubarray(nums,goal) - getSubarray(nums,goal-1);
    }
}