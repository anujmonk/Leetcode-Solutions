class Solution {
     List<List<Integer>> ans = new ArrayList<>();
     Set<Integer> set = new HashSet<>();
    public List<List<Integer>> permute(int[] nums) {
        
        // Used set to contain the current elements and then backtracked
        
        List<Integer> list = new ArrayList<>();
        backtrack(nums,0,list);
        
        return ans;
    }
    
    private void backtrack(int[] nums, int idx,List<Integer> list){
        
        if(list.size()==nums.length)
        {
            ans.add(new ArrayList<>(list));
        }
        
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            set.add(nums[i]);
            backtrack(nums,idx,list);
            int curr= list.get(list.size()-1);
            list.remove(list.size()-1);
            set.remove(curr);
        }
        
    }
}