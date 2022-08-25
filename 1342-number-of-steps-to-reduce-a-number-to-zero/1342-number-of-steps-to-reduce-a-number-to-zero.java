class Solution {
    public int numberOfSteps(int n) {
      
        return helper(n, 0);
    }
    
    private int helper(int num, int steps){
        
        if(num==0) return steps;
        
        if(num %2 == 0){
            return helper(num/2, steps+1);
        } else {
            return helper(num-1, steps+1);
        }
        
    }
}