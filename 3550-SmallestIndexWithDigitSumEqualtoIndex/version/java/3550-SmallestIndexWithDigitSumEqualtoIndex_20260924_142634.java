// Last updated: 24/09/2026, 14:26:34
1class Solution {
2    public int smallestIndex(int[] nums) {
3        for (int i = 0; i < nums.length; i++) {
4            int num = nums[i];
5            int sum = 0;
6
7            while (num > 0) {
8                sum += num % 10;
9                num /= 10;
10            }
11
12            if (sum == i) {
13                return i;
14            }
15        }
16        return -1;
17    }
18}