//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().immediateSmaller(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    void immediateSmaller(int arr[], int n) {
        // int[] ans = new int[n];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i]>arr[i+]
        }
        arr[arr.length-1]=-1;
        // Stack<Integer> stack = new Stack<>();
        
        // int i=0;int j=arr.length-1;
        
        // while(j>=i){
        // while(!stack.empty() && arr[j] < stack.peek()){
        //   stack.pop();
        // }
        // int temp = arr[j];
    
        // if(stack.empty()){
        //     arr[j] = -1;
        // } else {
        //     arr[j] = stack.peek();
        // }
        // stack.push(temp);
        // j--;
        // }
        
    }
}