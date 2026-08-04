// Last updated: 04/08/2026, 12:38:14
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        HashSet<Integer> seen = new HashSet<>();
4
5        int mn = Integer.MAX_VALUE;
6        int mx = Integer.MIN_VALUE;
7
8        for (int num : nums) {
9            seen.add(num);
10            mn = Math.min(mn, num);
11            mx = Math.max(mx, num);
12        }
13
14        List<Integer> ans = new ArrayList<>();
15
16        for (int x = mn; x <= mx; x++) {
17            if (!seen.contains(x)) {
18                ans.add(x);
19            }
20        }
21
22        return ans;
23    }
24}