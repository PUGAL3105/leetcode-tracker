// Last updated: 21/08/2026, 13:42:18
1import java.util.*;
2
3class Solution {
4    public long findKthSmallest(int[] coins, int k) {
5        Arrays.sort(coins);
6
7        List<Long> usefulList = new ArrayList<>();
8
9        for (int coin : coins) {
10            boolean redundant = false;
11
12            for (long prev : usefulList) {
13                if (coin % prev == 0) {
14                    redundant = true;
15                    break;
16                }
17            }
18
19            if (!redundant) {
20                usefulList.add((long) coin);
21            }
22        }
23
24        int m = usefulList.size();
25
26        long[] useful = new long[m];
27        for (int i = 0; i < m; i++) {
28            useful[i] = usefulList.get(i);
29        }
30
31        long low = 1;
32        long high = useful[0] * k;
33
34        int totalMasks = 1 << m;
35
36        long[] lcms = new long[totalMasks];
37
38        int[] signs = new int[totalMasks];
39
40        for (int mask = 1; mask < totalMasks; mask++) {
41            long currentLCM = 1;
42            int bits = 0;
43
44            for (int i = 0; i < m; i++) {
45                if ((mask & (1 << i)) != 0) {
46                    long g = gcd(currentLCM, useful[i]);
47
48                    currentLCM /= g;
49
50                    if (currentLCM > high / useful[i]) {
51                        currentLCM = high + 1;
52                        break;
53                    }
54
55                    currentLCM *= useful[i];
56                    bits++;
57                }
58            }
59
60            lcms[mask] = currentLCM;
61
62            signs[mask] = (bits % 2 == 1) ? 1 : -1;
63        }
64
65        while (low < high) {
66            long mid = low + (high - low) / 2;
67            long count = 0;
68
69            for (int mask = 1; mask < totalMasks; mask++) {
70                if (lcms[mask] <= mid) {
71                    count += signs[mask] * (mid / lcms[mask]);
72                }
73            }
74
75            if (count >= k) {
76                high = mid;
77            } else {
78                low = mid + 1;
79            }
80        }
81
82        return low;
83    }
84
85    private long gcd(long a, long b) {
86        while (b != 0) {
87            long temp = a % b;
88            a = b;
89            b = temp;
90        }
91
92        return a;
93    }
94}