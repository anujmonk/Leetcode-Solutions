class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        // We use each element as an index and mark that index with negative of the value present on         //  it.
        
        List<Integer> result= new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            int j = Math.abs(nums[i])-1;
            nums[j]=-Math.abs(nums[j]);
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                result.add(i+1);
        }
        
        return result;
    }
}
