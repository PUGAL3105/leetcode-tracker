// Last updated: 09/07/2026, 09:47:35
class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char i ='a' ;i<='z';i++)
        {
            if(sentence.indexOf(i)==-1)
            return false;
        }
        return true;
        
    }
}