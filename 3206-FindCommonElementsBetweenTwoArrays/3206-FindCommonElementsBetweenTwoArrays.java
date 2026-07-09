// Last updated: 09/07/2026, 09:47:08
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c1=0;
        int c2=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    c1++;
                    break;
                }
            }
        }
          for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    c2++;
                    break;
                }
            }
        }
        return new int[]{c1,c2};
        
    }
}