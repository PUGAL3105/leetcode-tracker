// Last updated: 09/07/2026, 09:48:17
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[k++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 !=0){
                ans[k++]=nums[i];
            }
        }
        return ans;
    }
}