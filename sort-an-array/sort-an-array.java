class Solution {
    // Merge Sort
    public int[] sortArray(int[] nums) {
    
    /**
    There are two ways to solve this approach using Top Down Recursion and Bottom Up Recursion
    */ 
        
    //Top Down
    
        if(nums.length>1) {
            int mid = nums.length/2;
            
            int[] left = new int[mid];
            for(int i=0;i<mid;i++) {
                left[i]=nums[i];
            }
            
            int[] right = new int[nums.length-mid];
            for(int i=mid;i<nums.length;i++) {
                right[i-mid]=nums[i];
            }
            int[] l=sortArray(left);
            int[] r=sortArray(right);
            
            return merge(l,r);
        }
        return nums;
    }
    
    private int[] merge(int[] left, int[] right) {
        int[] ans= new int[left.length+right.length];
        int l=0,r=0,idx=0;
        
        while(l <left.length && r<right.length) {
            if(left[l]<right[r]) {
                ans[idx++]=left[l];
                l++;
            }
            else {
                ans[idx++]=right[r];
                r++;
            }
        }
        
        while(l<left.length) {
            ans[idx++]=left[l];
            l++;
        }
        while(r<right.length) {
            ans[idx++]=right[r];
            r++;
        }
        
        return ans;
    }
}