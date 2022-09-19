class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Without space 1. Brute force- check for every element 2. sort array check for adjacent elements
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}