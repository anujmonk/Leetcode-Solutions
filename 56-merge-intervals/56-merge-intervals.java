class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(intervals[0][0]);
        l.add(intervals[0][1]);
        list.add(l);
            
        for(int i=1;i<intervals.length;i++) {
            int[] curr= {list.get(list.size()-1).get(0),list.get(list.size()-1).get(1)};
            
            int endCurr = curr[1];
            
            int startInterval = intervals[i][0];
            int endInterval = intervals[i][1];
            if(startInterval<=endCurr) {
                list.remove(list.size()-1);
                List<Integer> m = new ArrayList<>();
                m.add(curr[0]);
                m.add(Math.max(endCurr,endInterval));
                list.add(m);   
            }
            else{
                
                List<Integer> z = new ArrayList<>();
                z.add(startInterval);
                z.add(endInterval);
                list.add(z);
            }
        }
    
        //System.out.println(list);
        int[][] ans= new int[list.size()][2];
        int i=0;
        for(List<Integer> a :list) {
            ans[i][0]=a.get(0);
            ans[i][1]=a.get(1);
            i++;
        }
        return ans;
    }
}