// Last updated: 09/07/2026, 09:50:15
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String w[] = s.split(" ");
        if(w.length != pattern.length())
        return false;
        Map index = new HashMap();
        for(Integer i=0;i<w.length;++i)
        {
            if(index.put(pattern.charAt(i),i) != index.put(w[i] ,i))
            {
                return false;
            }
            
        }
        return true;
    }
}