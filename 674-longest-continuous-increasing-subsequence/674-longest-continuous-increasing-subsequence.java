class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count =1;
        int max=0;
        for(int i=1;i<=nums.length;i++) {
            if(i==nums.length) {
                max=Math.max(count,max);
                count=1;
            }
            else if(nums[i]>nums[i-1]) {
                count++;
            }
            else {
                max=Math.max(count,max);
                count=1;
            }
        }
        return max;
    }
}