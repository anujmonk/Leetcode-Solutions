class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // BFS
        Set<String> set = new HashSet<>(wordDict);
        
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[s.length()];
        queue.add(0);
        
        while(!queue.isEmpty()) {
            int start = queue.remove();
            if(visited[start]) {
                continue;
            }
            StringBuffer buffer = new StringBuffer();
            for(int i=start;i<s.length();i++) {
                buffer.append(s.charAt(i));
                if(set.contains(buffer.toString())) {
                    queue.add(i+1);
                    if(i==s.length()-1) {
                        return true;
                    }
                }
            }
            visited[start]=true;
        }
        
        return false;
    }
}