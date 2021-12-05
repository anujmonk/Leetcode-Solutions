class Solution {
    public int subarraySum(int[] nums, int k) {
        
        // We are creating a hashmap for storing the running sum(continuous element sum) and its 
        // occurrence
        Map<Integer, Integer> sumMap = new HashMap<>();
        int ans=0;
        
        // An empty array with sum 0 and its count as 1.
        sumMap.put(0,1);
        int currSum=0;
        for(int i=0;i<nums.length;i++) {
            currSum+=nums[i];
            
            if(sumMap.containsKey(currSum-k)) {
                ans+=sumMap.get(currSum-k);
            }
            
            if(!sumMap.containsKey(currSum)) {
                sumMap.put(currSum,1);
            }
            else{
                sumMap.put(currSum,sumMap.get(currSum)+1);
            }
            
            
        }
        return ans;
    }
}