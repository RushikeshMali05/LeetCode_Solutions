class Solution {
    public int findMin(int[] nums) {
        int start =0;
        int end = nums.length-1;
        
       if(nums.length==0) return -1;
        if(nums.length==1) return nums[0];
        
        
        if(nums[start]<nums[end]) return nums[start];        
       
        while(start<end){
            int mid = start + (end - start)/2;
            
            if(nums[mid] >= nums[start] && nums[mid] > nums[end]){
                
                start = mid+1;
                
            } else if(nums[mid] <= nums[start] && nums[mid]>nums[end]){

                end = mid-1;
            } else end--;
        }
        return nums[start];
    }
}