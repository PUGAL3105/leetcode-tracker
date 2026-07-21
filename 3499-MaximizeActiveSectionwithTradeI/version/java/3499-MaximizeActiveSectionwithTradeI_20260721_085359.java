// Last updated: 21/07/2026, 08:53:59
1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3        int ones = 0;
4        for (char c : s.toCharArray())
5            if (c == '1')
6                ones++;
7
8        s = "1" + s + "1";
9
10        int n = s.length();
11        int i = 0;
12
13        int ans = ones;
14        while (i < n && s.charAt(i) == '1')
15            i++;
16        int c10 = 0;
17        while (i < n && s.charAt(i) == '0') {
18            c10++;
19            i++;
20        }
21
22        while (i < n) {
23            int c11 = 0;
24            while (i < n && s.charAt(i) == '1') {
25                c11++;
26                i++;
27            }
28
29            if (c11 == 0)
30                break;
31            int c20 = 0;
32            while (i < n && s.charAt(i) == '0') {
33                c20++;
34                i++;
35            }
36
37            if (c20 == 0)
38                break;
39
40            ans = Math.max(ans, ones + c10 + c20);
41
42            c10 = c20;
43        }
44
45        return ans;
46    }
47}