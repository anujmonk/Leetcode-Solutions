class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] str= s.split(" ");
        if(str.length!=pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!map.get(pattern.charAt(i)).equals(str[i])) {
                    return false;
                }
            }
            else {
                    map.put(pattern.charAt(i),str[i]);
            }
        }
        
        Map<String, Character> map1 = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++) {
            if(map1.containsKey(str[i])) {
                if(map1.get(str[i])!=pattern.charAt(i)) {
                    return false;
                }
            }
            else {
                    map1.put(str[i],pattern.charAt(i));
            }
        }
        
        
        return true;
    }
}