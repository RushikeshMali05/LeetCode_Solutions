class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = nums[0];
        int i=0;
        int j=0;
        int res = Integer.MAX_VALUE;
        
        while(j<nums.length){
           
            if(sum>=target){
                sum -= nums[i];
                res = Math.min(res,j-i+1);
                i++;
                
                
            }else{
            
                j++;
                if(j<nums.length)                 sum+=nums[j];

            
        }
        }
        if(res == Integer.MAX_VALUE) return 0;
        return res;
    }
}