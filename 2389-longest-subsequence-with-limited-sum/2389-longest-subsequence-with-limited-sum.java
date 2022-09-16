class Solution {
public int[] answerQueries(int[] nums, int[] queries) {
    Arrays.sort(nums);
    int[] prefixArray = new int[nums.length];
    prefixArray[0] = nums[0];
    for(int i = 1; i < nums.length; i++){
        prefixArray[i] = prefixArray[i-1] + nums[i];
    }
    int[] answer = new int[queries.length];
    for(int i = 0; i < queries.length; i++){
        int num = queries[i];
        int index = binarySearch(prefixArray, num);
        answer[i] = index + 1;
    }
    return answer;
}

private int binarySearch(int[] array, int sum){
    int start = 0;
    int end = array.length - 1;
    
    int index = -1;
    
    while(start <= end){
        int mid = start + (end - start)/2;
        int num = array[mid];
        
        if(num <= sum){
            index = Math.max(index, mid);
            start = mid + 1;
        }else if(num > sum){
            end = mid - 1;
        }
    }
    return index;
}
}