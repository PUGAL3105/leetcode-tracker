// Last updated: 21/09/2026, 11:33:07
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        Arrays.sort(nums);
5
6        for (int i = 0; i < nums.length; i++) {
7            if (i > 0 && nums[i] == nums[i-1]) {
8                continue;
9            }
10            
11            int j = i + 1;
12            int k = nums.length - 1;
13
14            while (j < k) {
15                int total = nums[i] + nums[j] + nums[k];
16
17                if (total > 0) {
18                    k--;
19                } else if (total < 0) {
20                    j++;
21                } else {
22                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
23                    j++;
24
25                    while (nums[j] == nums[j-1] && j < k) {
26                        j++;
27                    }
28                }
29            }
30        }
31        return res;        
32    }
33}