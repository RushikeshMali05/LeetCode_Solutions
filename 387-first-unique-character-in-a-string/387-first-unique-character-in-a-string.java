class Solution {
    public int firstUniqChar(String s) {
        
        
        HashMap <Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i=0;i<s.length();i++){
            
            char c = s.charAt(i);
            
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
            
        }
        
        for(int j=0;j<s.length();j++){
            int a = map.get(s.charAt(j));
            if(a == 1) return j;
        }
        
        return -1;
    }
}