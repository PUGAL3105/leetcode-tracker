// Last updated: 09/07/2026, 09:53:06
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
       
        int n = nums.length;
        int minSum =  nums[0] + nums[1] + nums[2]; 
        for(int i = 0; i < n - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue; 
            int left = i+1;
            int right = n-1;
            
            while(left < right){
                int currMinSum = nums[i] + nums[left] + nums[right]; 

                if(Math.abs(target - currMinSum) < Math.abs(target - minSum)){
                    minSum = currMinSum;
                }

                if(currMinSum == target){
                    return currMinSum;
                } else if(currMinSum < target){
                    left++;
                } else{
                    right--; 
                }
            }
        }
        return minSum;
    }
}