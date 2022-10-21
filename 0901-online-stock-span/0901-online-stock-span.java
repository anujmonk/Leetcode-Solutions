class StockSpanner {
    
    class Pair{
        
        public int x;
        public int y;
        
        public Pair(int x,int y) {
            this.x = x;
            this.y=y;
        }
    }
    
    Stack<Pair> stack;
    int count;
    public StockSpanner() {
        stack = new Stack();
        count =0;
    }
    
    public int next(int price) {
        count++;
        while(!stack.isEmpty() && price>=stack.peek().x) {
            stack.pop();
        }
        if(stack.isEmpty()) {
            stack.push(new Pair(price,count));
            return count;
        }
        else {
            int ans = count-stack.peek().y;
            
            stack.push(new Pair(price,count));
            return ans;
        }
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */