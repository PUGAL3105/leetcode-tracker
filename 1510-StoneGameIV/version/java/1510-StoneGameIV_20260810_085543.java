// Last updated: 10/08/2026, 08:55:43
1class Solution {
2    public boolean winnerSquareGame(int n) {
3        boolean[] dp = new boolean[n + 1];
4
5        for (int i = 0; i <= n; i++) {
6            if (!dp[i]) {
7                for (int j = 1; i + j * j <= n; j++) {
8                    dp[i + j * j] = true;
9                }
10            }
11        }
12
13        return dp[n];
14    }
15}