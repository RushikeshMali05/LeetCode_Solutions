class Solution {
   public int signOfX(double x){

        if(x<0)
            return -1;
            
        if(x>0)
            return 1;
           
        
        return 0;      
    }
    

public int arraySign(int[] nums) {
    double prod=1;
   
    for(int i=0; i<=nums.length-1; i++){
        prod=prod*nums[i];
    }

    return signOfX(prod);
}
    }
