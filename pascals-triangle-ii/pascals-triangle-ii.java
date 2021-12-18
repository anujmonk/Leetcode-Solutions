class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        if (rowIndex == 0) {
            return new ArrayList<>(){{add(1);}};
        }
        else if(rowIndex == 1) {
            return new ArrayList<>(){{add(1); add(1);}};
        }
        List<Integer> list = getRow(rowIndex-1);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i=0;i<list.size()-1;i++) {
            ans.add(list.get(i)+list.get(i+1));
        }
        ans.add(1);
        return ans;
    }
}