//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    Solution ob = new Solution();
		    long[] res = ob.nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        ot.print(res[i] + " ");
		    ot.println();
		}
        ot.close();
	}
}



// } Driver Code Ends


// User Function Template for JAVA

class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        long[] ans = new long[arr.length];
        int i=0;
        int j=arr.length-1;
        Stack<Long> stack = new Stack<>();
        
        while(j>=0){
            while(!stack.empty() && arr[j] > stack.peek()){
                stack.pop();
            }
            if(stack.empty()){
                ans[j] = -1;
            } else {
                ans[j] = stack.peek();
            }
            stack.push(arr[j]);
            j--;
        }
        return ans;
    } 
}