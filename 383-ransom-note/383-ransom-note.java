class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     
        if(magazine.length() < ransomNote.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i=0;i<magazine.length();i++){
            
            char c = magazine.charAt(i);

            if(map.containsKey(c)){
                
                map.put(c, (map.get(c) + 1));
                
            } else {
                map.put(c, 1);
            }
            
        }
        
        for(int i=0;i<ransomNote.length();i++){
            
            char c = ransomNote.charAt(i);
            
            if(map.containsKey(c)){
                
                if(map.get(c) <=0 ) {
                    return false;
                } else {
                    map.put(c, (map.get(c)-1));
                } 
                
            } else {
                            return false;
            }

        }
        return true;
        
    }
}