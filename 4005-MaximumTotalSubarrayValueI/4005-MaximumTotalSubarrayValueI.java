// Last updated: 09/07/2026, 09:46:41
class Solution {
    public long maxTotalValue(int[] nums, int k) {

        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        return 1L * (max - min) * k;
    }
}