class Solution {
    public boolean checkIfExist(int[] nums) {
     
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            
            int start=0;
            int end = nums.length-1;
            int target = 2*nums[i];
            
            while(start <= end){
                
                int mid = start + (end - start)/2;
                
                if(nums[mid] == target && mid!=i){
                    return true;
                } 
                else if(nums[mid] < target){
                    start = mid +1;
                } else {
                    end = mid -1;
                }
                
                
            }
            
        }
        return false;
        
    }
}