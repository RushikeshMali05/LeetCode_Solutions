class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0,j=0,n=nums1.length,m=nums2.length,max=0;
        while(i<n && j<m){
            if(nums1[i]>nums2[j]){
                i++;
            }
            else{
                max=Math.max(max,j-i);
                j++;
            }
        }
  return max;
    }
}