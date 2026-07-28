// Last updated: 28/07/2026, 10:22:29
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        if (nums1.length > nums2.length) {
4            return findMedianSortedArrays(nums2, nums1);
5        }
6
7        int len1 = nums1.length, len2 = nums2.length;
8        int left = 0, right = len1;
9
10        while (left <= right) {
11            int part1 = (left + right) / 2;
12            int part2 = (len1 + len2 + 1) / 2 - part1;
13
14            int maxLeft1 = (part1 == 0) ? Integer.MIN_VALUE : nums1[part1 - 1];
15            int minRight1 = (part1 == len1) ? Integer.MAX_VALUE : nums1[part1];
16            int maxLeft2 = (part2 == 0) ? Integer.MIN_VALUE : nums2[part2 - 1];
17            int minRight2 = (part2 == len2) ? Integer.MAX_VALUE : nums2[part2];
18
19            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
20                if ((len1 + len2) % 2 == 0) {
21                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
22                } else {
23                    return (double) Math.max(maxLeft1, maxLeft2);
24                }
25            } else if (maxLeft1 > minRight2) {
26                right = part1 - 1;
27            } else {
28                left = part1 + 1;
29            }
30        }
31        return 0.0;        
32    }
33}