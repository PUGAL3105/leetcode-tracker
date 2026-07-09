// Last updated: 09/07/2026, 09:48:29
class Solution {
    public boolean rotateString(String s, String goal) {
       
        if(s.length() != goal.length())
        {
            return false;
        }
       return (s+s).contains(goal);
    }
}