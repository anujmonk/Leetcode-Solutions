class Solution {
 
 // My brute Force solution : I tried to make it two pointer but since I changed value of i in the loop it will not be One pass solution.
 
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

// Efficient Solution:
/*
class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[pos] = nums[i];
                pos++;
            }
        }
        for(int i = pos; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
*/
