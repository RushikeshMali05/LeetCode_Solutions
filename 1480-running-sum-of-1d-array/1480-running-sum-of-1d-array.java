class Solution {
    public int[] runningSum(int[] nums) {
        int arr[] = new int[nums.length];
        
        arr[0] = nums[0];
    int i=1;
        for(i=1;i<nums.length;i++){
            arr[i] = arr[i-1] + nums[i];
        }
        return arr;
    
    }
}