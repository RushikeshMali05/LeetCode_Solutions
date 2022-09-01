class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        
        for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
                if(map.get(c) == 2) return c;
                break;
            }
            else {
                map.put(c, 1);
            }
        }
        return 0;
    }
}