class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int ans = triangle.get(0).get(0);
        
       
        
       List<Integer> list = new ArrayList<>(triangle.get(0));
        
        for(int i=0;i<triangle.size()-1;i++) {
            
            List<Integer> list1 = triangle.get(i+1);
            
            List<Integer> curr = new ArrayList<>(list);
            List<Integer> c =new ArrayList<>();
            
            ans = Integer.MAX_VALUE;
            for(int j=0;j<list1.size();j++) {
                
                int left = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;
                
                if(j-1>=0) {
                    left = list1.get(j) +list.get(j-1);
                }
                if(j<list.size()) {
                    right = list1.get(j) + list.get(j);
                }
                c.add(Math.min(left,right));
                ans = Math.min(ans,c.get(j));
            }
            
            list = new ArrayList<>(c);
           
        }
        return ans;
    }
}