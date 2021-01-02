class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i:nums)
            sum+=i;
        
        int left_sum=0;
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
            if(left_sum==sum)
                return i;
            left_sum+=nums[i];
        }
        return -1;
    }
}
