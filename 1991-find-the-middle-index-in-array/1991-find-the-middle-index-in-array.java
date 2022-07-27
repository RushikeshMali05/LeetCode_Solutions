class Solution {
    public int findMiddleIndex(int[] nums) {
         int sum =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        
        int left_sum =0;
        for(int i=0;i<nums.length;i++){
            int right_sum = sum -left_sum -nums[i];
            
            if(left_sum == right_sum){
                return i;
            }
            else{
                left_sum += nums[i];
            }
        }
        return -1;
    }
}