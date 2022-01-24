class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int[] ans = new int[numCourses];    
        
        int[] inDegree = new int[numCourses];
        Map<Integer,List<Integer>> map= new HashMap<>();
        for(int[] course: prerequisites) {
            int take = course[1];
            int prev= course[0];
            
            inDegree[prev]+=1;
            if(map.containsKey(take)) {
                map.get(take).add(prev);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(prev);
                map.put(take,list);
            }
        }
        
        Queue<Integer> queue = new LinkedList<>();
        boolean zeroIndegree=false;
        for(int i=0;i<inDegree.length;i++) {
            if(inDegree[i]==0){
                queue.add(i);
                zeroIndegree=true;
            }
        }
        
        if(!zeroIndegree) {
            return new int[]{};
        }
        int k=0;
        
        while(!queue.isEmpty()) {
            int currCourse = queue.remove();
            ans[k++]=currCourse;
            List<Integer> neighbour = map.get(currCourse);
            if(neighbour!=null){
                for(Integer i:neighbour) {
                    inDegree[i]--;
                    if(inDegree[i]==0) {
                        queue.add(i);
                    }
                }
            }
        }
        if(k==numCourses)
            return ans;
        
        return new int[]{};
    }
}