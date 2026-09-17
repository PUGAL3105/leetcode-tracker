// Last updated: 17/09/2026, 09:04:54
1class Solution {
2    public int minSumOfLengths(int[] arr, int target) {
3        int n = arr.length;
4
5        int[] best = new int[n];
6
7        java.util.Arrays.fill(best, Integer.MAX_VALUE);
8
9        int left = 0;
10        int sum = 0;
11        int answer = Integer.MAX_VALUE;
12
13        for (int right = 0; right < n; right++) {
14            sum += arr[right];
15
16            while (sum > target) {
17                sum -= arr[left];
18                left++;
19            }
20
21            if (sum == target) {
22                int currentLength = right - left + 1;
23
24                if (left > 0 && best[left - 1] != Integer.MAX_VALUE) {
25                    answer = Math.min(
26                        answer,
27                        currentLength + best[left - 1]
28                    );
29                }
30
31                best[right] = currentLength;
32            }
33
34            if (right > 0) {
35                best[right] = Math.min(best[right], best[right - 1]);
36            }
37        }
38
39        return answer == Integer.MAX_VALUE ? -1 : answer;
40    }
41}