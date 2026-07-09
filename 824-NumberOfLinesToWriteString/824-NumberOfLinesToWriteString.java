// Last updated: 09/07/2026, 09:48:28
class Solution {
    public int[] numberOfLines(int[] widths, String s) {

        int lines = 1;
        int width = 0;

        for (int i = 0; i < s.length(); i++) {

            int w = widths[s.charAt(i) - 'a'];

            if (width + w <= 100) {
                width += w;
            } else {
                lines++;
                width = w;
            }
        }

        return new int[]{lines, width};
    }
}