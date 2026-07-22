// Last updated: 22/07/2026, 08:51:09
1import java.util.regex.*;
2
3
4class Solution {
5    private int[] zs, ze, V;
6    private int nblocks;
7    private List<int[]> sparse;
8
9    public List<Integer> maxActiveSectionsAfterTrade(String s, int[][] queries) {
10        int ones = (int) s.chars().filter(c -> c == '1').count();
11        List<Integer> zsL = new ArrayList<>(), zeL = new ArrayList<>();
12        Matcher mo = Pattern.compile("0+").matcher(s);
13        while (mo.find()) { zsL.add(mo.start()); zeL.add(mo.end() - 1); }
14        zs = zsL.stream().mapToInt(Integer::intValue).toArray();
15        ze = zeL.stream().mapToInt(Integer::intValue).toArray();
16        nblocks = zs.length;
17        V = IntStream.range(0, nblocks - 1)
18                     .map(j -> (ze[j] - zs[j] + 1) + (ze[j + 1] - zs[j + 1] + 1))
19                     .toArray();
20        int nv = V.length;
21        sparse = new ArrayList<>();
22        sparse.add(V);
23        for (int half = 1; half * 2 <= nv; half *= 2) {
24            int[] prev = sparse.get(sparse.size() - 1);
25            int[] next = new int[prev.length - half];
26            for (int i = 0; i < next.length; i++)
27                next[i] = Math.max(prev[i], prev[i + half]);
28            sparse.add(next);
29        }
30
31        List<Integer> ans = new ArrayList<>(queries.length);
32        for (int[] q : queries) ans.add(ones + gain(q[0], q[1]));
33        return ans;
34    }
35
36    private int rmq(int lo, int hi) {                
37        int t = 31 - Integer.numberOfLeadingZeros(hi - lo + 1);
38        return Math.max(sparse.get(t)[lo], sparse.get(t)[hi - (1 << t) + 1]);
39    }
40
41    private int clip(int j, int l, int r) {           
42        return V[j] - Math.max(0, l - zs[j]) - Math.max(0, ze[j + 1] - r);
43    }
44
45    private int gain(int l, int r) {
46        if (nblocks < 2) return 0;
47        int ja = lowerBound(ze, l);                   
48        int jb = upperBound(zs, r) - 2;               
49        if (ja > jb) return 0;
50        return Math.max(Math.max(clip(ja, l, r), clip(jb, l, r)),
51                        jb - ja >= 2 ? rmq(ja + 1, jb - 1) : 0);
52    }
53
54    private static int lowerBound(int[] a, int x) {
55        int lo = 0, hi = a.length;
56        while (lo < hi) { int mid = (lo + hi) >>> 1; if (a[mid] < x) lo = mid + 1; else hi = mid; }
57        return lo;
58    }
59    private static int upperBound(int[] a, int x) {
60        int lo = 0, hi = a.length;
61        while (lo < hi) { int mid = (lo + hi) >>> 1; if (a[mid] <= x) lo = mid + 1; else hi = mid; }
62        return lo;
63    }
64}