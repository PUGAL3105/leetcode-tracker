// Last updated: 09/07/2026, 09:50:31
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
         int prefix[]=new int[n];
         int suff[]=new int[n];
         prefix[0]=1;
         for(int i=1;i<nums.length;i++)
         prefix[i]=prefix[i-1]*nums[i-1];
         suff[nums.length-1]=1;
         for(int i=nums.length-2;i>=0;i--)
         suff[i]=suff[i+1]*nums[i+1];
         int ans[]=new int[n];
         for(int i=0;i<nums.length;i++){
            ans[i]=prefix[i]*suff[i];
         }
         return ans;
    }
}