// Last updated: 26/07/2026, 08:55:49
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4       int n=nums.length;
5       int p1=nums[n-1]*nums[n-2]*nums[n-3];
6       int p2=nums[0]*nums[1]*nums[n-1];
7       return Math.max(p1,p2);
8    }
9}