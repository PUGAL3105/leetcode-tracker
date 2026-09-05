// Last updated: 05/09/2026, 08:27:35
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4        int[] mn = new int[n];
5        mn[n-1] = nums[n-1] ;
6        for (int i = n-2; i >= 0; i--)
7            mn[i] = Math.min(nums[i], mn[i+1]);
8        int mxi = Integer.MIN_VALUE;
9        for (int i = 0; i < n; i++) {
10            mxi = Math.max(mxi, nums[i]) ;
11            if (mxi - mn[i] <= k) return i;
12        }
13        return -1;
14    }
15}