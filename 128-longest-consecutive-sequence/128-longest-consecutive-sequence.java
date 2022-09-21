class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) {
            set.add(i);
        }
        
        int ans =0;
        for(int i:set) {
            if(!set.contains(i-1)) {
                int curr = i;
                int count = 1;
                
                while(set.contains(curr+1)) {
                    curr+=1;
                    count+=1;
                }
                
                ans= Math.max(ans,count);
                
            }
        }
        return ans;
    }
}