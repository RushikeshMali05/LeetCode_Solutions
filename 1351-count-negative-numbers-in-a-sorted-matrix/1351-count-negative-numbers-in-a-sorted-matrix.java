class Solution {
    public int countNegatives(int[][] grid) {
        
        int rows = grid.length;
        int ans =0;
        
        for(int i=0;i<grid.length;i++){
            
            ans += binarySearch(grid[i],0, grid[i].length-1 );
            
        }
        
        return ans;
        
        
        
    }
    
    public int binarySearch(int[] arr, int start, int end){
        
        while(start <= end){
            
            int mid = start + (end - start)/2;
            
            if(arr[mid] >= 0){
                start = mid +1;
            } else {
                end = mid -1;
            }
            
        }
        return arr.length-end-1;
        
        
    }
}