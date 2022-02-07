class Solution {
     List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        
        helper(n,k,1,list);
        
        return ans;
    }
    
    private void helper(int n,int k,int curr,List<Integer> list) {
        
        
        
        if(list.size()==k) {
            List<Integer> a= new ArrayList<>(list);
            ans.add(a);
            //System.out.println(ans);
            return;
        }
        
        for(int i=curr;i<=n;i++) {
            list.add(i);
           // System.out.println(list);
            helper(n,k,i+1,list);
            list.remove(list.size()-1);
        }
        
    }
}