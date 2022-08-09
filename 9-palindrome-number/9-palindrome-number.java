class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;   
    int reverse = 0;
    while(x>0){
        int digit = x%10;  // last no dekha
        reverse = reverse * 10; 
        reverse = reverse + digit; // last no ko add kiya reverse mai
        x=x/10;      // original no haar baar kaaam kiya
    }
    if(reverse==temp){
        return true;
    }else{
        return false;
    }
   
}
}
       
        
           
    
    
