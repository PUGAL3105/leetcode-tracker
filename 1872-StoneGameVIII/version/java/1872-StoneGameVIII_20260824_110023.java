// Last updated: 24/08/2026, 11:00:23
1class Solution {
2    public int stoneGameVIII(int[] A) {
3        int n = A.length;
4        for (int i = 1; i < n; i++)
5            A[i] += A[i - 1];
6
7        int ans = A[n - 1];
8        for (int i = n - 2; i > 0; i--)
9            ans = Math.max(ans, A[i] - ans);
10
11        return ans;
12    }
13}