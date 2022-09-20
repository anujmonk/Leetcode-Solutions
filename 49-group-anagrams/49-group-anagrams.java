class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++) {
            String s = strs[i];
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            String sNew = new String(sArr);
            if(map.containsKey(sNew)) {
                map.get(sNew).add(s);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sNew,list);
            }
        }
        
        for(Map.Entry<String,List<String>> entry:map.entrySet()) {
            ans.add(entry.getValue());
        }
        
        return ans;
    }
}