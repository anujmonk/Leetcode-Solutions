class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        for(i=0;i<nums.length;i++) {
            if(nums[Math.abs(nums[i])] < 0) {
                break;
            }
            nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])]; 
        }
        
        
        return Math.abs(nums[i]);
    }
}