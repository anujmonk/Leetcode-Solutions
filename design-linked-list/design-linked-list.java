class MyLinkedList {
    
    private Node head;
​
    private class Node{
        
        int val;
        Node next=null;
        
        public Node(int val){
            this.val=val;
        }   
    }
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head=null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int size=0;
        Node current=head;
        while(current!=null){
            current=current.next;
            size++;
        }
        
        if(index>=size || index<0)
            {
            return -1;
            }
        
        current=head;
        int pointer=0;
        while(pointer<index){
            current=current.next;
            pointer++;
        }
        return current.val;
        
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
