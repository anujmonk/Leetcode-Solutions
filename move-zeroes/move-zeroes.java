class Solution {
    public void moveZeroes(int[] nums) {
        int zero_pointer=0;
        boolean check=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && check!=true){
                zero_pointer=i;
                check=true;
            }
            else if(check==true && nums[i]!=0){
                    check=false;
                    int temp=nums[zero_pointer];
                    nums[zero_pointer]=nums[i];
                    nums[i]=temp;
                    i=zero_pointer;
            }
            
        }
    }
}
