class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i:nums) {
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a,b) -> hashMap.get(a) - hashMap.get(b));
        
        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet()) {
            queue.add(entry.getKey());
            if(queue.size()>k) {
                queue.remove();
            }
            
        }
        
        int[] ans = new int[k];
        for(int i=k-1;i>=0;i--) {
            ans[i] = queue.remove();
        }
        return ans;
    }
}