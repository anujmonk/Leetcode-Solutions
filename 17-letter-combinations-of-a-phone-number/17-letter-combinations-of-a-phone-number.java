class Solution {
    public List<String> letterCombinations(String digits) {
        
        if(digits == null || digits.length()==0) {
            return new ArrayList<String>();
        }
        
        Map<Character,List<Character>> map = new HashMap<>();
        
        createMap(map);
        List<String> list = new ArrayList<>();    
        int pos=0;
        StringBuffer buffer = new StringBuffer();
        backtrack(digits,list,pos,buffer,map);
        
        return list;
    }
    
    private void backtrack(String digits,List<String> list,int pos, StringBuffer buffer,Map<Character,List<Character>> map) {
        
        if(pos==digits.length()) {
            list.add(buffer.toString());
            return;
        }
        
        
        for(char digit:map.get(digits.charAt(pos))) {
            buffer.append(digit);
            backtrack(digits,list,pos+1,buffer,map);
            buffer.delete(buffer.length()-1,buffer.length());
        }
        
    }
    
    private void createMap(Map<Character,List<Character>> map) {
        int c=97;
        for(int i=2;i<=6;i++) {
            List<Character> list= new ArrayList<>();
            for(int j=0;j<3;j++) {
                list.add((char)(c));
                c++;
            }
            map.put((char)(48+i),list);
        }
        List<Character> list= new ArrayList<>();
        list.add('p');
        list.add('q');
        list.add('r');
        list.add('s');
        map.put((char)(48+7),list);
        
        list= new ArrayList<>();
        list.add('t');
        list.add('u');
        list.add('v');
        map.put((char)(48+8),list);
        
        list= new ArrayList<>();
        list.add('w');
        list.add('x');
        list.add('y');
        list.add('z');
        map.put((char)(48+9),list);
    }
}