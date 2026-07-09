// Last updated: 09/07/2026, 09:49:02
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int last = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > last) {
                    last = count;
                }
            } else {
                count = 0;
            }
        }

        return last;
    }
}