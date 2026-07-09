// Last updated: 09/07/2026, 09:48:01
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length && k > 0; i++) {

            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        Arrays.sort(nums);

        if (k % 2 == 1) {
            nums[0] = -nums[0];
        }

        int s = 0;

        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }

        return s;
    }
}