// Last updated: 07/08/2026, 11:08:47
1class Solution {
2    int primes[] = new int[] { 2, 3, 5, 7 };
3    int maxPrime = primes[primes.length - 1];
4
5    public String smallestNumber(String num, long t) {
6        int primeCount[] = new int[maxPrime + 1];
7        int numLength = num.length();
8        int minLength;
9        int firstZeroIndexFromLeft = 0;
10
11        for (int prime : primes) {
12            while (t % prime == 0) {
13                t /= prime;
14                primeCount[prime]++;
15            }
16        }
17
18        if (t != 1) {
19            return "-1";
20        }
21
22        minLength = getMinLength(primeCount);
23
24        if (numLength < minLength) {
25            return buildSuffix(primeCount, minLength, new char[minLength]);
26        }
27
28        char[] result = new char[numLength + 1];
29
30        for (int i = 0; firstZeroIndexFromLeft < numLength
31                && (result[++i] = num.charAt(firstZeroIndexFromLeft)) != '0'; firstZeroIndexFromLeft++) {
32            logNum(primeCount, result[i], -1);
33        }
34
35        if (getMinLength(primeCount) == 0) {
36            if (firstZeroIndexFromLeft == numLength) {
37                return num;
38            }
39            Arrays.fill(result, ++firstZeroIndexFromLeft, result.length, '1');
40            return new String(result, 1, numLength);
41        }
42
43        for (int last = numLength - 1, end = Math.min(firstZeroIndexFromLeft, last); end >= 0; end--) {
44            for (logNum(primeCount, result[end + 1], 1); ++result[end + 1] <= '9'; logNum(primeCount, result[end + 1],
45                    1)) {
46                logNum(primeCount, result[end + 1], -1);
47                if (getMinLength(primeCount) <= last - end) {
48                    return buildSuffix(primeCount, last - end, result);
49                }
50            }
51        }
52
53        return buildSuffix(primeCount, result.length, result);
54    }
55
56    void logNum(int[] primeCount, int num, int value) {
57        if (num < '2') {
58            return;
59        }
60
61        if (num == '9') {
62            primeCount[3] += value << 1;
63        } else if (num == '4') {
64            primeCount[2] += value << 1;
65        } else if (num == '8') {
66            primeCount[2] += value * 3;
67        } else if (num == '6') {
68            primeCount[2] += value;
69            primeCount[3] += value;
70        } else {
71            primeCount[num - '0'] += value;
72        }
73    }
74
75    String buildSuffix(int[] primeCount, int targetLength, char[] result) {
76        int index = result.length;
77
78        while (primeCount[3] > 1) {
79            primeCount[3] -= 2;
80            result[--index] = '9';
81        }
82
83        while (primeCount[2] > 2) {
84            primeCount[2] -= 3;
85            result[--index] = '8';
86        }
87
88        while (primeCount[7]-- > 0) {
89            result[--index] = '7';
90        }
91
92        if (primeCount[2] > 0 && primeCount[3] > 0) {
93            result[--index] = '6';
94            primeCount[2]--;
95            primeCount[3]--;
96        }
97
98        while (primeCount[5]-- > 0) {
99            result[--index] = '5';
100        }
101
102        while (primeCount[2] > 1) {
103            primeCount[2] -= 2;
104            result[--index] = '4';
105        }
106
107        while (primeCount[3] > 0) {
108            primeCount[3]--;
109            result[--index] = '3';
110        }
111
112        while (primeCount[2] > 0) {
113            primeCount[2]--;
114            result[--index] = '2';
115        }
116
117        while (index + targetLength != result.length) {
118            result[--index] = '1';
119        }
120
121        return targetLength == result.length ? new String(result) : new String(result, 1, result.length - 1);
122    }
123
124    int getMinLength(int[] primeCount) {
125        int count2 = Math.max(0, primeCount[2]);
126        int count3 = Math.max(0, primeCount[3]);
127        int count23 = (count3 & 1) + (count2 % 3);
128
129        return (count3 >> 1) + (count2 / 3) + Math.max(0, primeCount[7]) + Math.max(0, primeCount[5])
130                + (count23 == 3 ? 2 : count23 > 0 ? 1 : 0);
131    }
132}