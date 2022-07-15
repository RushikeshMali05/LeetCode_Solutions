class Solution {
    public void moveZeroes(int[] nums) {
        int l =0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i] != 0){
                nums[j++] = nums[i];
                
            }
            else{
                l++;
            }
        }
        
 for(int i=0;i<l;i++){
       nums[nums.length-i-1]=0;
    }    }
}