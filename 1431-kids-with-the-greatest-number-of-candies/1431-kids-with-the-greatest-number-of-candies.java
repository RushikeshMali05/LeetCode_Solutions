class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> list = new ArrayList<>();
        int large = candies[0];
        int i,j;
        for(i=0;i<candies.length;i++){
            if(candies[i]>large){
                large = candies[i];
            }
        }
        
        for(j=0;j<candies.length;j++){
            if(candies[j]+extraCandies>=large){
                list.add(true);
           
            }
             else list.add(false);
        }
        return list;
    }
}