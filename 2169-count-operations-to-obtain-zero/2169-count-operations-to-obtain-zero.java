class Solution {
    public int countOperations(int num1, int num2) {
        return count(num1, num2, 0);
    }
    
    public int count(int m, int n, int steps){
        
        
        if(m == 0 || n == 0){
            return steps;
        }
        
        if(m>=n){
           return count(m-n, n, steps+1);
        }
        
        else{
            return count(m, n-m, steps+1);
        }
        
        
    }
}