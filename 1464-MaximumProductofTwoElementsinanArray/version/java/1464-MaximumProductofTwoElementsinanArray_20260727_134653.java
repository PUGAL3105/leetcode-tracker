// Last updated: 27/07/2026, 13:46:53
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max=0;
4        int sc=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]>max){
7                sc=max;
8                max=nums[i];
9            }
10            else if(nums[i]>sc ){
11                sc=nums[i];
12            }
13        }
14        int p=((max-1)*(sc-1));
15        return p;
16    }
17}