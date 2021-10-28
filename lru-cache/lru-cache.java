class Node {
        Node prev;
        Node next;
        int key; 
        int val;
        public Node(int key ,int val,Node prev,Node next){
            this.key=key;
            this.val=val;
            this.prev=prev;
            this.next=next;
        }
    }
    
class LRUCache {
    private Node head;
    private Node tail;
    private Map<Integer,Node> map;
    private int capacity;
    
    public LRUCache(int capacity) {
        this.head=new Node(-1,-1,null,null);
        this.tail=new Node(-1,-1,null,null);
        this.head.next=this.tail;
        this.tail.prev=this.head;
        this.map=new HashMap<>();
        this.capacity=capacity;
    }
    
    
    
    public int get(int key) {
        Node curr=null;
        if(!map.containsKey(key))
        {
            return -1;
        }
        else{
            curr=map.get(key);
            
            // temp and next of curr
            Node temp_prev=curr.prev;
            Node temp_next=curr.next;
            
            
            temp_prev.next=temp_next;
            temp_next.prev=temp_prev;
            curr.next=head.next;
            curr.next.prev=curr;
            head.next=curr;
            curr.prev=head;
            map.put(key,curr);           
        }
        System.out.println(curr.key+" "+curr.val);
        return curr.val;
    }
    
    public void put(int key, int value) {
        Node curr=null;
        if(map.containsKey(key)) {
            curr=map.get(key);
            
            // temp and next of curr
            Node temp_prev=curr.prev;
            Node temp_next=curr.next;
            
            
            temp_prev.next=temp_next;
            temp_next.prev=temp_prev;
            
            curr.next=head.next;
            curr.next.prev=curr;
            head.next=curr;
            curr.prev=head;
            
            curr.val=value;
            
            map.put(curr.key,curr);
            return;
        }
        if(map.size()>=this.capacity){
            Node temp_curr=tail.prev;
            map.remove(temp_curr.key);
            tail.prev=temp_curr.prev;
            temp_curr.prev.next=tail;
            temp_curr.next=null;
            temp_curr.prev=null;   
        }
        if(!map.containsKey(key)) {
            Node new_curr=new Node(key,value,null,null);
            
            new_curr.next=head.next;
            head.next.prev=new_curr;
            head.next=new_curr;
            new_curr.prev=head;
            
            map.put(key,new_curr);
        }
        
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */