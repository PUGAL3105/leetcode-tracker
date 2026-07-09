// Last updated: 09/07/2026, 09:47:30
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns)
            if (word.indexOf(s) != -1) count++; 
        return count;
    }
}