class Solution {
    public boolean judgeSquareSum(int c) {
    
        int start =0;
        long end = (long)Math.sqrt(c);
        
        while(start<=end){
            
            if(start*start + end*end == c) return true;
            
            else if(start*start + end*end < c) start++;
            
            else end--;
            
        }
        
        return false;
    }
}