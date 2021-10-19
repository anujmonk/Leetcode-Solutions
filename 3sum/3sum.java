class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> out;
        if(nums.length<3){
            out=new ArrayList<>();
            return out;
        }
            
        
        // Sort the array
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length-2;i++) {
            int low=i+1;
            int high=nums.length-1;
            while(low<high){
                if(nums[i]+nums[low]+nums[high]==0)
                {
                    set.add(new ArrayList<>(Arrays.asList(nums[i],nums[low],nums[high])));
                    low++;
                    high--;
                }      
                else if(nums[i]+nums[low]+nums[high]>0){
                    high--;
                }
                else{
                    low++;
                }
            }
        }
        out=new ArrayList<>(set);
        return out;
    }
}