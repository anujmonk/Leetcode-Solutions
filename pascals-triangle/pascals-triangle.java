class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out=new ArrayList<>();
        
        List<Integer> prev=new ArrayList<>();
        prev.add(1);
        out.add(prev);
        
        numRows--;
            
        while(numRows>0){
            List<Integer> res=new ArrayList<>();
            res.add(1);
            
            // In between computation
            for(int i=0;i<prev.size()-1;i++){
                res.add(prev.get(i)+prev.get(i+1));
            }
            
            res.add(1);
            prev=new ArrayList<>(res);
            out.add(prev);
            numRows--;
        }
        
        
        return out;
    }
}