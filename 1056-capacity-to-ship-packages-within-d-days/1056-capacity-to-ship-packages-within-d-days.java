class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=Integer.MIN_VALUE;
        int end=0;
        for(int i:weights){
            start=Math.max(start,i);
            end+=i;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            int currDays = check(weights,days,mid);
            if(currDays<=days){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return start;
    }
    int check(int[] weights, int days, int capacity){
        int currDays=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]<=capacity){
                sum+=weights[i];
            } else {
                currDays++;
                sum=weights[i];
            }
        }
        return currDays;
    }
}