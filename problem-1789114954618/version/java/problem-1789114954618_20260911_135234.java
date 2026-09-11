// Last updated: 11/09/2026, 13:52:34
1class Solution {
2    public int totalNumbers(int[] digits) {
3        int[] f = new int[10];
4        int res = 0;
5
6        for (int d : digits) f[d]++;
7
8        for (int i = 1; i < 10; i++) 
9            for (int j = 0; j < 10; j++) 
10                for (int k = 0; k < 9; k += 2) {
11                    f[i]--; f[j]--; f[k]--;
12
13                    if (f[i] >= 0 && f[j] >= 0 && f[k] >= 0) res++;
14
15                    f[i]++; f[j]++; f[k]++;
16                }           
17        
18
19        return res;
20    }
21}