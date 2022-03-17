class Twitter {
    
    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    
    Map<Integer,List<Integer>> followMap;
    Map<Integer,Integer> tweetMap;
    Node tweets;
    
    public Twitter() {
        followMap = new HashMap<>();
        tweetMap = new HashMap<>();
        tweets = new Node(-1);
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!followMap.containsKey(userId)) {
            List<Integer> list = new ArrayList<>();
            list.add(userId);
            followMap.put(userId,list);
        }
        Node newNode = new Node(tweetId);
        newNode.next = tweets;
        tweets = newNode;
        tweetMap.put(tweetId,userId);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> result = new ArrayList<>();
        if(!followMap.containsKey(userId)) {
            return result;
        }
        Node curr = tweets;
        List<Integer> l = followMap.get(userId);
        Set<Integer> set = new HashSet<>();
        set.addAll(l);
        while(curr!=null) {
            if(set.contains(tweetMap.get(curr.value))) {
                result.add(curr.value);
            }
            if(result.size()==10) {
                break;
            }
            curr=curr.next;
        }
        
        return result;
    }
    
    public void follow(int followerId, int followeeId) {
        if(!followMap.containsKey(followerId)) {
            List<Integer> list = new ArrayList<>();
            list.add(followerId);
            followMap.put(followerId,list);
        }
        followMap.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(followMap.containsKey(followerId)) {
            followMap.get(followerId).remove(Integer.valueOf(followeeId));
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */