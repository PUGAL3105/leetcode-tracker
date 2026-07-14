// Last updated: 14/07/2026, 08:54:13
1class Solution {
2    public int subsequencePairCount(int[] nums) {
3        int m = Arrays.stream(nums).max().getAsInt(), mod = (int)1e9 + 7;
4        int[][] dp = new int[m + 1][m + 1];
5        dp[0][0] = 1;
6        for (int x : nums) {
7            int[][] next = new int[m + 1][m + 1];
8            for (int g1 = 0; g1 <= m; g1++) {
9                for (int g2 = 0; g2 <= m; g2++) {
10                    if (dp[g1][g2] == 0) continue;
11                    next[g1][g2] = (next[g1][g2] + dp[g1][g2]) % mod;
12                    int n1 = gcd(g1, x), n2 = gcd(g2, x);
13                    next[n1][g2] = (next[n1][g2] + dp[g1][g2]) % mod;
14                    next[g1][n2] = (next[g1][n2] + dp[g1][g2]) % mod;
15                }
16            }
17            dp = next;
18        }
19        long ans = 0;
20        for (int g = 1; g <= m; g++)
21            ans = (ans + dp[g][g]) % mod;
22        return (int)ans;
23    }
24
25    int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
26}