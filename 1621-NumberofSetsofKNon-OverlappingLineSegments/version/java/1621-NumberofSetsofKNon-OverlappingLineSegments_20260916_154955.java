// Last updated: 16/09/2026, 15:49:55
1class Solution {
2    private static final long MOD = 1_000_000_007L;
3
4    private long modPow(long base, long exp) {
5        long result = 1;
6
7        while (exp > 0) {
8            if ((exp & 1L) != 0) {
9                result = result * base % MOD;
10            }
11
12            base = base * base % MOD;
13
14            exp >>= 1;
15        }
16
17        return result;
18    }
19
20    public int numberOfSets(int n, int k) {
21        long N = n + k - 1L;
22        long R = 2L * k;
23
24        R = Math.min(R, N - R);
25
26        long numerator = 1;
27        long denominator = 1;
28
29        for (long i = 1; i <= R; i++) {
30            numerator = numerator * (N - R + i) % MOD;
31
32            denominator = denominator * i % MOD;
33        }
34
35        long inverseDenominator = modPow(denominator, MOD - 2);
36
37        return (int) (numerator * inverseDenominator % MOD);
38    }
39}