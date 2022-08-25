class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> list = new ArrayList<>();
        
        int i=0;
        int j =0;
        
        while(i<nums1.length && j<nums2.length){
            
            if(i>0 && nums1[i] == nums1[i-1]){
                i++;
                continue;
            }
            
            
            else if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            } else {
                
                if(nums1[i] < nums2[j]){
                    i++;
                } else {
                    j++;
                }
            }
            
            
            
        }
        
        int[] ans  = new int[list.size()];
        for(int a=0;a<ans.length;a++){
            ans[a] = list.get(a);
        }
        return ans;
    }
}