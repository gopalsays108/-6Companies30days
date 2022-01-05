// link: https://leetcode.com/submissions/detail/613574682/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0;
        int result = Integer.MAX_VALUE;
        
        int valSum = 0;
        
        for(int i =0; i < nums.length; i++){
            
            valSum += nums[i];
            
            while(valSum >= target){
                result = Math.min(result, i + 1 - left);
                
                valSum -= nums[left];
                left++;
            }
        }
        
        return (result != Integer.MAX_VALUE )? result : 0;
        
    }
}
