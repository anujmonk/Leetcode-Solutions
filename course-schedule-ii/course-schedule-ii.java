class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> list=new ArrayList<>();
        
        Map<Integer,List<Integer>> map=new HashMap<>();
        int[] indegree=new int[numCourses];
        for(int[] i:prerequisites) {
            int from=i[1];
            int to=i[0];
            
            indegree[to]++;
            if(!map.containsKey(from)){
                map.put(from,new ArrayList<>());
            }
            map.get(from).add(to);
        }
        
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++) {
            if(indegree[i]==0){
                queue.add(i);
                list.add(i);
            }
        }
        
     
        while(!queue.isEmpty()) {
            int front=queue.poll();
            
            if(map.containsKey(front)) {
                for(Integer i:map.get(front)){
                    indegree[i]--;
                    if(indegree[i]==0) {
                        list.add(i);
                        queue.add(i);
                    }
                }
            }
        }
        
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]!=0){
                int[] out={};
                return out;
            }
        }
        
        int[] out=new int[list.size()];
        for(int i=0;i<out.length;i++) {
            out[i]=list.get(i);
        }
        
        return out;
    }
}