// Last updated: 09/07/2026, 09:49:14
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int c[]=new int[n+1];
        for(int num:nums){
            c[num]++;
        }
        List<Integer> a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(c[i]==0){
                a.add(i);
            }
        }
        return a;
    }
}