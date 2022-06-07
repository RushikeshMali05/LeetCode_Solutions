class Solution {
    public boolean containsDuplicate(int[] nums) {
          
         /*if(nums.length == 1){
            return false;
        }
        
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
      
       
        
       for(int j=0;j<nums.length;j++){
           if(nums[j] != j+1){
               return true;
           }
           
       }
        return false;
        
    }
        
         void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }*/

        HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i])){
                return true;
            }
            else{
                a.put(nums[i],1);
            }
        }
        return false;
        }
    }
