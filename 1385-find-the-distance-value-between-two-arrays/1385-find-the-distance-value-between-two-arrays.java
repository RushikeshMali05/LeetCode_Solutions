class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;
        for(int j:arr1){
            int z=bs(arr2,j,d);
            if(z!=0){
                ans+=1;
            }
        }
        return ans;
    }
    
    static int bs(int[] arr,int t, int d) {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(Math.abs(t-arr[m]) <= d){
                return 0;
            }
            if(arr[m]<=t){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return -1;
    }
}