// Doubly linked list
class BrowserHistory {
    
    class Node {
        String address;
        Node prev;
        Node next;
        
        public Node(String add) {
            address = add;
            prev =null;
            next=null;
        } 
    }
    
    Node head;
    Node curr;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        curr = head;
    }
    
    public void visit(String url) {
        curr.next = new Node(url);
        curr.next.prev=curr;
        curr=curr.next;
    }
    
    public String back(int steps) {
        int k =0;
        
        while(k<steps && curr.prev!=null) {
            curr=curr.prev;
            k++;
        }
        
        return curr.address;
    }
    
    public String forward(int steps) {
        int k =0;
        
        while(k<steps && curr.next!=null) {
            curr=curr.next;
            k++;
        }
        
        return curr.address;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */