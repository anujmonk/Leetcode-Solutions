class MyCircularQueue {
    
    int[] arr;
    int front;
    int rear;
    
    
    public MyCircularQueue(int k) {
        arr = new int[k];
        front = -1;
        rear = -1;
        k=k;
    }
    
    public boolean enQueue(int value) {
        if(isEmpty()) {
            front=0;
            rear=front;
            arr[rear] = value;
            return true;
        }
        else if(isFull()) {
            return false;
        }
        rear = (rear+1)%arr.length;
        arr[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        
        front = (front+1)%arr.length;
        if(front==(rear+1)%arr.length) {
            front =-1;
            rear = -1;
        }
        return true;
    }
    
    public int Front() {
        if(front ==-1 && rear==-1) {
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(front ==-1 && rear==-1) {
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        if(front ==-1 && rear==-1) {
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if((front == 0 && rear==arr.length-1) || (front==rear+1)) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */