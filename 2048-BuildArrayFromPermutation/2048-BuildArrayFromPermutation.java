// Last updated: 09/07/2026, 09:47:33
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[nums[i]];

        }
        return ans;
    }
}