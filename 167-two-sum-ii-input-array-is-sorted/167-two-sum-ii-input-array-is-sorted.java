class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        int start =0;
        int end = nums.length-1;
        int[] ans = new int[2];
        while(start <= end){
            
            if(nums[start] + nums[end] == target){
                
                ans[0] = start+1;
                ans[1] = end+1;
                return ans;
                
            } else if(nums[start] + nums[end] < target){
                start++;
            }  else {
                end--;
            }  
            
            
        }
        return ans;
        
    }
}