class Solution {
    public int arraySign(int[] nums) {
    
        
        double sum =1;
        for(int i=0;i<=nums.length-1;i++){
            sum = sum* nums[i];
        
      
    }
       System.out.println(sum);
        return signFunc(sum);
    }
    
    public int signFunc(double x){
        if(x<0)
            return -1;
            
        if(x>0)
            return 1;
           
        
        return 0;      
    }
        
    }
    
