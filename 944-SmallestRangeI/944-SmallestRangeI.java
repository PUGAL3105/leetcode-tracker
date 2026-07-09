// Last updated: 09/07/2026, 09:48:15
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int mx=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mx){
                mx=nums[i];
            }
            else if(nums[i]<min){
                min=nums[i];
            }
        }
        int c=mx-min;
        if(c<=2*k){
            return 0;
        }
        return c-2*k;
    }
}