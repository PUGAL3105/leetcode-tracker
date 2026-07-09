// Last updated: 09/07/2026, 09:52:11
class Solution {
    public int removeDuplicates(int[] nums) {
         int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;        
    }
}