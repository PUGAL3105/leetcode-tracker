// Last updated: 09/07/2026, 09:48:50
class Solution {
    public int findLHS(int[] nums) {

        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            int count = 0;
            int found = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == nums[i] || nums[j] == nums[i] + 1) {
                    count++;
                }

                if (nums[j] == nums[i] + 1) {
                    found = 1;
                }
            }

            if (found == 1 && count > max) {
                max = count;
            }
        }

        return max;
    }
}