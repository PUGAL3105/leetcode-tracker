// Last updated: 09/07/2026, 09:53:04
class Solution {
    public List<String> letterCombinations(String digits) {
         String[] mapping = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        result.add("");
        for (char d : digits.toCharArray()) {
            String letters = mapping[d - '0'];
            List<String> temp = new ArrayList<>();
            for (String p : result) {
                for (char c : letters.toCharArray()) {
                    temp.add(p + c);
                }
            }
            result = temp;
        }
        return result;
    }
}