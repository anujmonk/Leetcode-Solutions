class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i)))
                if(map1.get(s.charAt(i))==t.charAt(i))
                    continue;
                else
                    return false;
            if(map1.containsValue(t.charAt(i)))
                if(map1.containsKey(s.charAt(i))){
                    if(map1.get(s.charAt(i))==t.charAt(i))
                        continue;
                }
                else
                    return false;
            
            map1.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }
}
