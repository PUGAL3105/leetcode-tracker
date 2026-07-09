// Last updated: 09/07/2026, 09:47:38
class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int sc=0;
        for(int i=0;i<gain.length;i++){
          sc= sc+gain[i];
            if(sc>max){
                max=sc;
            }
            
        }
        return max;
    }
}