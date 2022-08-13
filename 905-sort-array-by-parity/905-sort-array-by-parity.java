class Solution {
    public int[] sortArrayByParity(int[] nums) {
       
       int start =0;
       int end =nums.length-1;
        
        int[] ans = new int[nums.length];
        
    for(int i=0;i<nums.length;i++){
        
        if(nums[i] % 2 == 0){

        ans[start] = nums[i];
            start++;
            
        } else {
            ans[end] = nums[i];
            end--;
        }
        
    }
        return ans;
        
}

}