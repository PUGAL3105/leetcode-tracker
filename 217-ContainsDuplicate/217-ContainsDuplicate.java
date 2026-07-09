// Last updated: 09/07/2026, 09:50:44
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == nums[i-1])
            {
                return true;
            }
        }
        return false;
    }
}