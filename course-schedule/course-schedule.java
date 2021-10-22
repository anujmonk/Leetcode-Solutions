class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        // Creting indegree array and the adjacency list of graph using hashmap
        int[] indegree=new int[numCourses];
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int[] x: prerequisites) {
            int to=x[1];
            int from=x[0];
            
            indegree[to]++;
            if(!map.containsKey(from)){
                map.put(from,new ArrayList<>());
            }
            map.get(from).add(to);
            }
            
//         for(int i:indegree) {
//             System.out.println("indegree: "+i);    
//         }
//         for(Map.Entry<Integer,List<Integer>> set:map.entrySet())
//         {
//             System.out.println("key: "+set.getKey());
//             System.out.println("value: "+set.getValue());
            
//             for(Integer i:set.getValue()) {
//                 System.out.println("value: "+i);
//             }
//         }
//         System.out.println();
        
        //BFS
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++) {
            if(indegree[i]==0) {
                queue.add(i);
            }
        }
        
        //Removing Dependecies by decreasing indegree
        while(!queue.isEmpty()){
            int front=queue.poll();

            if(map.containsKey(front)) {
                for(int i:map.get(front)) {
                    indegree[i]--;
                    if(indegree[i]==0)
                    {
                        queue.add(i);
                    }
                }
            }
        }
        
        for(int i:indegree) {
            if(i!=0)
                return false;
        }
        
        return true;
    }
}
