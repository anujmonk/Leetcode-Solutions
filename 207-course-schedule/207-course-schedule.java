class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
     
        // Create an indegree array
        int[] inDegree = new int[numCourses];
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int[] arr:prerequisites) {
            int take = arr[1];
            int prev=arr[0];
            
            inDegree[take]+=1;
            if(map.containsKey(prev)) {
                map.get(prev).add(take);
            }
            else {
                List<Integer> list= new ArrayList<>();
                list.add(take);
                map.put(prev,list);
            }
        }
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0;i<inDegree.length;i++) {
            if(inDegree[i]==0) {
                queue.add(i);
            }
        }
        
        if(queue.isEmpty()) {
            return false;
        }
        int count=0;
        while(!queue.isEmpty()) {
            int course = queue.remove();
           
            count++;
            if(map.containsKey(course)){
                for(Integer i:map.get(course)) {
                    inDegree[i]-=1;
                    if(inDegree[i]==0) {
                        queue.add(i);
                    }
                }
            }
        }
        
        return count==numCourses;
    }
}