// Last updated: 09/07/2026, 09:53:21
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            String temp = "";

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (temp.indexOf(ch) != -1) {
                    break;
                }

                temp += ch;
            }

            if (temp.length() > max) {
                max = temp.length();
            }
        }

        return max;
    }
}