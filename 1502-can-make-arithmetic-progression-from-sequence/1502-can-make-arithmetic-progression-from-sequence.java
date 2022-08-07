class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
           int j=0;
        int diff =arr[j+1] - arr[j];

        for(int i=1;i<arr.length-1;i++){
            if(arr[i+1] - arr[i] != diff){
                return false ;
            }
        }
        return true;
    }
}