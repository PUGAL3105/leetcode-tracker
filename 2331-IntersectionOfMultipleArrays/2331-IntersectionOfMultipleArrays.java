// Last updated: 09/07/2026, 09:47:25
class Solution {
    public List<Integer> intersection(int[][] nums) {
         int[] count = new int[1001];

        for (int[] arr : nums) {
            for (int num : arr) {
                count[num]++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            if (count[i] == nums.length) {
                ans.add(i);
            }
        }

        return ans; 
    }
}