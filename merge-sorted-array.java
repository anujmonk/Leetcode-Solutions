class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length==0 || nums2.length==0){
            return;
        }
        int left_space=nums1.length-nums2.length;
        int j=0;
        for(int i=0;i<nums1.length && j<nums2.length;i++){
            if(nums1[i]>=nums2[j]){
                for(int k=left_space;k>i;k--){
                    nums1[k]=nums1[k-1];
                }
                nums1[i]=nums2[j];
                ++j;
                ++left_space;
            }
        }
        while(left_space<nums1.length && j<nums2.length){
            nums1[left_space]=nums2[j];
            ++j;
            ++left_space;
        }
    }
}
