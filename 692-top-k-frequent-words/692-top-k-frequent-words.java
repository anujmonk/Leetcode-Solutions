class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String,Integer> map = new HashMap<>();
        
        for(String s:words) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        
        Queue<String> heap = new PriorityQueue<>((a,b) -> 
                                                 {
                                                  if(map.get(a)==map.get(b)) {
                                                      return b.compareTo(a);
                                                  }
                                                  else{
                                                     return map.get(a) - map.get(b);       
                                                  }
                                                 }
                                                    );
        
        for(Map.Entry<String,Integer> entry:map.entrySet()) {
            
            if(heap.size()<k) {
                heap.add(entry.getKey());
            }
            else if(map.get(heap.peek())<=entry.getValue()) {
                if(map.get(heap.peek())==entry.getValue()) {
                    int a = entry.getKey().compareTo(heap.peek());
                    
                    System.out.println(a +" "+entry.getKey()+" "+heap.peek());
                    if(a<0) {
                    heap.poll();
                    heap.add(entry.getKey()); 
                        
                    }
                    continue;
                }
                 System.out.println(" "+entry.getKey()+" "+heap.peek());
                heap.poll();
                heap.add(entry.getKey());
            }
            
           // System.out.println("word: "+ entry.getKey() +" "+heap);
            }
        
        
        List<String> ans = new ArrayList<>();
        while(!heap.isEmpty()) {
            ans.add(heap.remove());
        }
        Collections.reverse(ans);
        return (ans);
    }
}