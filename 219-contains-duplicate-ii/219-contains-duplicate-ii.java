class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // Brute Force : Use two loops find the indices and then check for subtraction
        // Efficient Method: Use Hashmap to store first occurrence of element
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i]) && (Math.abs(map.get(nums[i]) - i)<=k)) {
                return true;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}