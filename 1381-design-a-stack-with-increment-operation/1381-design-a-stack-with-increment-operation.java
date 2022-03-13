class CustomStack {
    
    int[] arr;
    int idx;
    int size;

    public CustomStack(int maxSize) {
        idx=-1;
        arr=new int[maxSize];
        size=maxSize;
    }
    
    public void push(int x) {
        if(idx!=size-1) {
            idx++;
            arr[idx]=x;
        }
    }
    
    public int pop() {
        
        if(idx<0) {
            return -1;
        }
        
        return arr[idx--];
        
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<Math.min(k,idx+1);i++) {
            arr[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */