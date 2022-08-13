class Solution {
    public int[] sortArrayByParity(int[] nums) {
       
       int flag =0;
        int flag1 =nums.length-1;
        
        int[] ans = new int[nums.length];
        
    for(int i=0;i<nums.length;i++){
        
        if(nums[i] % 2 == 0){

        ans[flag] = nums[i];
            flag++;
            
        } else {
            ans[flag1] = nums[i];
            flag1--;
        }
        
    }
        return ans;
        
}

}