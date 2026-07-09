// Last updated: 09/07/2026, 09:51:05
class Solution {
    public int majorityElement(int[] nums) {
    
        Arrays.sort(nums);
        return nums[nums.length/2];
       
    }
}