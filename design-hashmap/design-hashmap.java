class MyHashMap {

    /** Initialize your data structure here. */
    
    class Node{
        int key;
        int value;    
        
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    
    Node[] list;
    public MyHashMap() {
        list=new Node[1000001];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        if(list[key]==null)
            list[key]=new Node(key,value);
        else
            list[key].value=value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(list[key]==null)
            return -1;
        else
            return list[key].value;
        
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if(list[key]!=null)
            list[key]=null;
    }
    
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */