class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        int currSum=0;
        Map<Integer,Integer> sumMap = new HashMap<>();
        sumMap.put(0,-1);
        
        for(int i=0;i<nums.length;i++) {
            currSum+=nums[i];
            currSum=currSum%k;
            if(sumMap.containsKey(currSum)) {
                if(i-sumMap.get(currSum)>=2) {
                    return true;
                }
            }
            
            
            if(!sumMap.containsKey(currSum)) {
                sumMap.put(currSum,i);
            }
            
            
        }
        return false;
    }
}