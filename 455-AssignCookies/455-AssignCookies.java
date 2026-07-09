// Last updated: 09/07/2026, 09:49:11
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0, count = 0;

        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else if (g[i] > s[j]) {
                j++;
            } else {
                i++;
            }
        }

        return count;
    }
}