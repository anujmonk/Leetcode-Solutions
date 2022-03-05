class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String c: tokens) {            
            if(c.equals("+") || c.equals("-") || c.equals("*") ||c.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                int d = operation(a,b,c.charAt(0));
                
                stack.push(d);
            }
            else {
                stack.push((Integer.parseInt(c)));
            }
        }
        
        return stack.peek();
    }
    
    private int operation(int a,int b,Character op) {
        
        if(op=='+') {
            return a+b;
        }
        else if(op=='-'){
            return a-b;
        }
        else if(op=='*') {
            return a*b;
        }
        else if(op=='/'){
            
            return a/b;
        }
        return -1;
    }
}