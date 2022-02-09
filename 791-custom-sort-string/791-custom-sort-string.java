class Solution {
    public String customSortString(String order, String s) {
        
        // Store s in hashmap, iterate over s and print the count of each character, also at the            //end you will have to iterate over map to add rest of character
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(Character c:s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuffer buffer=new StringBuffer();
        for(Character o:order.toCharArray()) {
            if(map.containsKey(o)) {
                for(int i=0;i<map.get(o);i++) {
                    buffer.append(o);
                }
                map.remove(o);
            }
        }
        
        for(Map.Entry<Character,Integer> entry:map.entrySet()) {
            for(int i=0;i<entry.getValue();i++) {
                    buffer.append(entry.getKey());
                }
        }
        
        return buffer.toString();
    }
}