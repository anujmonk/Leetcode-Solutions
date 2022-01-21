class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String,Integer> map = new HashMap<>();
        
        for(String s:words) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        
        Queue<String> heap = new PriorityQueue<>(
            new Comparator<String>(){
                public int compare(String a,String b) {
                    if(map.get(a) == map.get(b)) {
                        return a.compareTo(b);
                    }
                    else {
                        return map.get(b) - map.get(a);
                    }
                }
            }
        );
        
        for(Map.Entry<String,Integer> entry:map.entrySet()) {
            heap.add(entry.getKey());
            }
        
        
        List<String> ans = new ArrayList<>();
        while(!heap.isEmpty() && k!=0) {
            ans.add(heap.remove());
            k--;
        }
        
        return ans;
    }
}