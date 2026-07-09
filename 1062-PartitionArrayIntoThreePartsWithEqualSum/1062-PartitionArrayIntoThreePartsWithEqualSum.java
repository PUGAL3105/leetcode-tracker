// Last updated: 09/07/2026, 09:47:59
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int s=0;
        for(int i=0;i<arr.length;i++){
            s +=arr[i];
        }
        if(s%3!=0){
            return false;
        }
        int t=s/3;
        int cr=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            cr +=arr[i];
            
            if(cr==t){
                c++;
                cr=0;
            }

        }
        return c>=3;
    }
}