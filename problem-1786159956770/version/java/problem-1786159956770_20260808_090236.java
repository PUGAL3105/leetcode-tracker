// Last updated: 08/08/2026, 09:02:36
1class Solution {
2    public int[] validSequence(String word1, String word2) {
3
4        int n = word1.length();
5        int m = word2.length();
6
7        int[] last = new int[m];
8
9        int j = m - 1;
10        for (int i = n - 1; i >= 0; i--) {
11            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
12                last[j] = i;
13                j--;
14            }
15        }
16
17        int[] ans = new int[m];
18
19        j = 0;
20        int usedMismatch = 0;
21        for (int i = 0; i < n && j < m; i++) {
22            if (word1.charAt(i) == word2.charAt(j)) {
23                ans[j] = i;
24                j++;
25            }
26            else if (usedMismatch == 0 &&
27                    (j == m - 1 || i + 1 <= last[j + 1])) {
28
29                ans[j] = i;
30                j++;
31                usedMismatch = 1;
32            }
33        }
34
35        if (j != m) {
36            return new int[0];
37        }
38
39        return ans;
40    }
41}