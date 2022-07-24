class Solution {
    public int[] sortedSquares(int[] nums) {
        int i,j,k,temp=0;
        for(i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
       
        
    for(j=0;j<nums.length;j++){
            for(k=0;k<nums.length-j-1;k++){
                if(nums[k]>nums[k+1]){
                    temp = nums[k];
                    nums[k] = nums[k+1];
                    nums[k+1] = temp;
                }
            }
        }
        return nums;
    }
}