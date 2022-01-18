class Solution {
    // Make valid pair and remove them if not found a valid pair add result in count
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        int count =0;
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==')') {
                if(stack.isEmpty()) {
                    count++; 
                }
                else if(stack.peek()=='(') {
                    stack.pop();
                }
                
            }
            else if(s.charAt(i)=='(') {
                stack.push(s.charAt(i));
            }
        }
        
        count+=stack.size();
        
        return count;
    }
}