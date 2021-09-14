import java.util.Stack;
class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1=new Stack<Integer>();
        stack2=new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack1.empty()==true)
            return -1;
        else{
            while(stack1.empty()==false){
                stack2.push(stack1.pop());
            }
            int answer=stack2.pop();
            while(stack2.empty()==false){
                stack1.push(stack2.pop());
            }
            return answer;
        }
    }
    
    /** Get the front element. */
    public int peek() {
        if(stack1.empty()==true)
            return -1;
        else{
            while(stack1.empty()==false){
                stack2.push(stack1.pop());
            }
            int answer=stack2.peek();
            while(stack2.empty()==false){
                stack1.push(stack2.pop());
            }
            return answer;
        }
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack1.empty()==true)
            return true;
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */