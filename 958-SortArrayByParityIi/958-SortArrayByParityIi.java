// Last updated: 09/07/2026, 09:48:12
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int a[]=new int[nums.length];
        int odd=1;
        int even=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]%2==0){
            a[even]=nums[i];
            even +=2;
           }
           else{
            a[odd]=nums[i];
            odd +=2;
           }
        }
        return a;
    }
}