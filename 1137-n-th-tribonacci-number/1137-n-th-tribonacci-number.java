class Solution {
    public int tribonacci(int n) {
        if(n==0 || n==1){
            return n;
        }
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return tib(n,dp);
    }
    public int tib(int n,int[] dp){
        if(n<=0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=tib(n-1,dp)+tib(n-2,dp)+tib(n-3,dp);
        return dp[n];
    }
}