class Solution {
    public void nextPermutation(int[] nums) {
        // Next permutation - Starting from behind whenever an index is smaller than its next index then swap them and then sort or reverse the elements from the next index of swapped
        
        // Previous permutation - Starting from behind whenever an index is greater than its next index then swap them and then reverse the elements from the next index of swapped
        
        
        boolean flag=false;
        for(int i=nums.length-1;i>0;i--) {
            int prev = i-1;
            int curr=i;
            if(nums[prev]<nums[curr]) {
                int index=curr;
                for(int j=curr;j<nums.length;j++) {
                    if(nums[j]>nums[prev]) {
                        index=j;
                    }
                    else {
                        break;
                    }
                }
                swap(nums,prev,index);
                flag=true;
                
                // We can also reverse the elements
                Arrays.sort(nums,prev+1,nums.length);
                break;
            }
        }
        if(flag==false) {
            Arrays.sort(nums);
        }
    }
    
    
    private void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}