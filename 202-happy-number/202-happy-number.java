class Solution {
    public boolean isHappy(int n) {
        
       int slow = n;
       int fast = n;
        
        do{
            slow = sumOfSq(slow);
            fast = sumOfSq(sumOfSq(fast));
        } while(slow!=fast);
        
        if(slow ==1) {
            return true;
        }
        return false;
        
    }
    
    public int sumOfSq(int i){
        
        int rem =0;
        int sum=0;
        
        while(i>0){
            
            rem = i%10;
            sum = sum+(rem*rem);
            i = i/10;
            
        }
        return sum;
    }
}