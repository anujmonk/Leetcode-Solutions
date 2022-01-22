class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        Set<Integer> visited= new HashSet<>();
        
        Queue<Integer> queue= new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()) {
            int room = queue.remove();
            if(visited.contains(room)) {
                continue;
            }
            visited.add(room);
            List<Integer> currRoom = rooms.get(room);
            for(Integer i:currRoom) {
                queue.add(i);
            }
        }
        
        return visited.size()==rooms.size();
    }
}