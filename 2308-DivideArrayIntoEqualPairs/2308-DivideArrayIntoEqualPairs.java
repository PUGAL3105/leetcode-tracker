// Last updated: 09/07/2026, 09:47:16
class Solution {
    public boolean divideArray(int[] nums) {
        int c[]=new int[501];
        for(int n:nums){
            c[n]++;
        }
            for(int i=0;i<c.length;i++){
                if(c[i]%2 !=0){
                    return false;
                }
            }
            return true;
        
    }
}