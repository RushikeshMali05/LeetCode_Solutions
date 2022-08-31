class Solution {
    public int findKthPositive(int[] arr, int k) {
       int j=1;
        int i=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(Arrays.toString(arr));
        while(i<arr.length){
            System.out.println(j+" "+arr[i]+" "+(j==arr[i]));
           if(j == arr[i]){
              j++;
               i++;
                
           } else {
 list.add(j);
               System.out.println(j);
               j++;
                          }
            
       }
        System.out.println(list);
        if(list.size()<k){
            return arr[arr.length-1]+k-list.size();
        }
        return list.get(k-1);
    }
    
    
//     public boolean binarySearch(int[] arr, int target){
//          int start =0;
//         int end = arr.length-1;
        
//         while(start<=end){
//             int mid = start + (end-start)/2;
            
//             if(arr[mid] == target){
//                 return true;
//             }
            
            
//             if(arr[mid] < target){
//                 start + mid+1;
//             } else {
//                 end = mid-1;
//             }
//         }
//     }
}