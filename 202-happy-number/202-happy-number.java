class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();
        
            while(!set.contains(n)){

                set.add(n);
                n = sumOfSq(n);
                
                if(n==1) return true;
                
            
            }
        
        return false;
        
    }
    
    public int sumOfSq(int i){
        
        int rem =0;
        int sum=0;
        
        while(i>0){
            
            rem = i%10;
            i = i/10;
            sum = sum+(rem*rem);
            
        }
        return sum;
    }
}