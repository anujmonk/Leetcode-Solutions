class Solution {
    public int removeElement(int[] nums, int val) {
        int pos=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val)
            {
                pos++;
                nums[pos]=nums[i];
            }
        }
        return pos+1;
    }
}