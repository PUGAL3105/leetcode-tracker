// Last updated: 16/07/2026, 15:47:08
1class Solution {
2    public int findNumbers(int[] nums) {
3        
4        int count=0;
5        
6        for(int i =0 ; i< nums.length; i++){
7            
8            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
9                count++;
10            }
11        }
12        
13        return count;
14        
15    }
16}