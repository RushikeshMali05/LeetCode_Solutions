class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
       Arrays.sort(nums);
    for(int i = 0; i < queries.length; i++) {
        int curr = 0;
        int count = 0;
        for(int j = 0; j < nums.length; j++) {
            curr += nums[j];
            if(curr <= queries[i]) {
                count++;
            }
            else 
                curr -= nums[j];
        }
        queries[i] = count;
    }
    return queries; 
    }
}