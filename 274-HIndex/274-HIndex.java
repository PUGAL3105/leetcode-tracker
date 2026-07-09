// Last updated: 09/07/2026, 09:50:21
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
       Arrays.sort(citations);
        for(int i=0;i<n;i++)
        {
            if(citations[i] >=n-i)
            {
                return n-i;
            }
           
        }
        return 0;
    }
}