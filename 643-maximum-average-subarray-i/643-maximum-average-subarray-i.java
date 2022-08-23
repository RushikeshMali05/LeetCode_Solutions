class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j = k-1;
        double res = 0;
        double max = Integer.MIN_VALUE;
        
        for(int a = 0;a<=j;a++){
            
            res+=nums[a];
        }
        res/=k;
        
        max = Math.max( max, res);
        
        i=0;
        j=k;
        while(j<nums.length){
            
            res*=k;
            res -= nums[i];
            res += nums[j];
            res /= k;
            max = Math.max(max,res);          
            
            i++;
            j++;
            
            
        }
        
        return max;
    }
}