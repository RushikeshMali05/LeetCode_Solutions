class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 0){
            return true;
        }
        
        long start =1;
        long end = num;
        long ans = -1;
        
        while(start<=end){
            long mid = start+(end-start)/2;
            
            if((mid*mid)==num){
                return true;
            }
            else if (num>(mid*mid)){
                                start = mid+1;

            }
            else{
                            end = mid-1;                     

            }
        }
        
        return false;
    }
}