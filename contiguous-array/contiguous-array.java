class Solution {
    public int findMaxLength(int[] nums) {
        /** We will maintain running sum and its starting index if that running exists or if running           sum of zero exists we check for length by current index - index present in hashmap and update
        the maximum length accordingly.
        **/
        
        
        //Creating an array to maintain running sum and its starting index
        Map<Integer,Integer> sumMap = new HashMap<>();
        //Updating sum of zero with index -1
        sumMap.put(0,-1);
        
        int maxLength=0;
        int currSum=0;
        for(int i=0;i<nums.length;i++) {
            // Upating currSum
            if(nums[i]==0) {
                currSum+=-1;
            }
            else {
                currSum+=1;
            }
            
            // Checking for length
            if(sumMap.containsKey(currSum)) {
                maxLength=Math.max(maxLength,i-sumMap.get(currSum));
            }
            
            //Updating hashmap
            if(!sumMap.containsKey(currSum)) {
                sumMap.put(currSum,i);
            }    
        }    
        return maxLength;
    }
}