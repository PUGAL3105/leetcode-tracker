// Last updated: 09/07/2026, 09:48:44
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0;
        for(int i=0;i<k;i++){
            s +=nums[i];
        }
        int mx=s;
        int n = nums.length;
        for(int i=k;i<n;i++){
            s = s+nums[i] -nums[i-k];
            if(s>mx){
                mx=s;
            }
        }
        return (double) mx/k;
    }
}