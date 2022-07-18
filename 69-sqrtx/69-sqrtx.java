class Solution {
    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        
        long start =0;
        long end = x;
        long ans=0;
        
        while(start<=end){
            long mid = start + (end-start)/2;
            
            if(x>=(mid*mid)){
            
            ans =mid;
                start = mid+1;
            
            }
            
            else{
                end = mid-1;
            }
        }
        
            return (int)ans;
            
        
    }
}