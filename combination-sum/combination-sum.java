class Solution {
    private List<List<Integer>> ans=new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        backtrack(0,candidates,target, new ArrayList<>());
        
        return ans;
    }
    
    public void backtrack(int index,int[] candidates, int target,List<Integer> path) {
        if(target<0) {
            return;
        }
        if(target==0) {
            ans.add(new ArrayList<Integer>(path));
        }
        
        for(int i=index;i<candidates.length;i++) {
            path.add(candidates[i]);
            backtrack(i,candidates,target-candidates[i],path);
            path.remove(path.size()-1);
        }
    }
}