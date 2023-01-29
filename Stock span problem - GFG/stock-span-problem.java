//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[price.length];
        int i=0;

        while(i<price.length){
            
            int count = 1;

            while(!stack.empty() && price[i] >= price[stack.peek()]){
                //System.out.println(stack+" "+stack.peek()+" "+ans[stack.peek()]+" "+count);
                count+=ans[stack.pop()];
            }
            ans[i]  = count;
            stack.push(i);
            // System.out.println(stack);
            i++;
            
        }
        return ans;
    }
    
}