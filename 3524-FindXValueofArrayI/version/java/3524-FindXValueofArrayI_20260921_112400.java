// Last updated: 21/09/2026, 11:24:00
1class Solution {
2    public long[] resultArray(int[] nums, int k) {
3        long[] ans = new long[k];
4        long[] dp = new long[k];
5
6        for (int num : nums) {
7            int x = num % k;
8            long[] next = new long[k];
9            next[x]++;
10
11            for (int r = 0; r < k; r++) {
12                int newR = (r * x) % k;
13                next[newR] += dp[r];
14            }
15
16            for (int r = 0; r < k; r++) {
17                ans[r] += next[r];
18            }
19            dp = next;
20        }
21        return ans;
22    }
23}