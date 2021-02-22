class Solution {
    public int majorityElement(int[] nums) {
     // Using voting algorithm
        
        //Finding a potential candidate
        int can=0,count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[can])
                count++;
            else
                count--;
            if(count==0){
                can=i;
                count=1;
            }
        }
        
        return nums[can];
    }
}