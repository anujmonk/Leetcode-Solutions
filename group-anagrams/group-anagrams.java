class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++) {
            String st=strs[i];
            char[] c= st.toCharArray();
            Arrays.sort(c);
            String s= new String(c);
            if(!map.containsKey(s)) {
                map.put(s,new ArrayList<String>());
            }
            map.get(s).add(st);
            map.put(s,map.get(s));
        }
        
        for(Map.Entry<String,List<String>> entry:map.entrySet()) {
            ans.add(entry.getValue());
        }
        
        return ans;
    }
}