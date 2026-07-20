// Last updated: 20/07/2026, 09:02:15
1class Solution {
2    public int[] decompressRLElist(int[] nums) {
3        int arrSize = 0;
4        for (int i = 0; i < nums.length; i += 2) {
5            arrSize += nums[i];
6        }
7        
8        int[] result = new int[arrSize];
9
10        int startIdx = 0;
11        for (int i = 0; i < nums.length; i += 2) {
12            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
13            startIdx += nums[i];
14        }
15        return result;
16    }
17}