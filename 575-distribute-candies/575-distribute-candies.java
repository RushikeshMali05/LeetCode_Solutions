class Solution {
    public int distributeCandies(int[] candyType) {
        
        Set<Integer> set = new HashSet<Integer>();
        
        int l = candyType.length/2;
        
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        
        if(l<set.size()) return l;
        return set.size();
        
    }
}