// Last updated: 09/07/2026, 11:59:25
1class Solution {
2    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] q) {
3         
4        boolean ans[] = new boolean[q.length]; 
5        int root[] = new int[nums.length]; 
6        root[0] = 0; 
7        for(int i = 1; i < nums.length; i++) {
8            root[i] = ((nums[i] - nums[i - 1]) <= maxDiff) ? root[i - 1] : i; 
9        }
10
11        for(int i = 0; i < q.length; i++) {
12            ans[i] = root[q[i][0]] == root[q[i][1]]; 
13        }
14        return ans; 
15    }
16}