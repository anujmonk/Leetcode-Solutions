class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        Queue<Integer> heap= new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));
        
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
            heap.add(entry.getKey());
            if(heap.size()>k) {
                heap.remove();
            }
        }
        int j=0;
        while(!heap.isEmpty()) {
            ans[j++]=heap.remove();
        }
        return ans;
    }
}