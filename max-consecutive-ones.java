class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                nums[i]=count;
            }
            else{
                count=0;
            }
        }
        count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>count)
                count=nums[i];
        }
        return count;
    }
}
