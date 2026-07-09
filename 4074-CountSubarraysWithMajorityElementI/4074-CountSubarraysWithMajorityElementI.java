// Last updated: 09/07/2026, 09:46:34
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        long a=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i;j<n;j++){
                if(nums[j]==target)
                c++;
                int l=j-i+1;
                if(2*c>l){
                    a++;
                }
            }
        }
        return (int)a;
    }
}