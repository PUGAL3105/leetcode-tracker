// Last updated: 09/07/2026, 09:47:00
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int id=(i+nums[i]%n +n)%n;
            ans[i]=nums[id];
        }
        return ans;
    }
}