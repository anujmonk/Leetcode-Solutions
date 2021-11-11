class Solution {
    
    private List<List<Integer>> ans=new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        
        backtrack(0,nums,new ArrayList<>());
        
        return ans;
    }
    
    public void backtrack(int index,int[] nums, List<Integer> path) {
        if(index>=nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        
        ans.add(new ArrayList<>(path));
        
        for(int i=index;i<nums.length;i++) {
            path.add(nums[i]);
            backtrack(i+1,nums,path);
            path.remove(path.size()-1);
        }
    }
}