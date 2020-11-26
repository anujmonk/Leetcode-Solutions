class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        else if(nums.length==1){
            if(nums[0]==val)
                return 0;
            else
                return 1;
        }
        else{
            int j=nums.length-1;
            for(int i=0;i<=j;i++){
                if(nums[i]==val){
                    while(j>=i && nums[j]==val)
                        j--;
                    if(i<j){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
                }
            }
            return j+1;
        }
    }
}
