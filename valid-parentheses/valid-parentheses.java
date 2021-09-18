class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stack.push(s.charAt(i));
            else
            {
                if(stack.empty())
                    return false;
                else{
                    char ele=stack.peek();
                    if(( s.charAt(i)==')' && ele=='(' )|| ( s.charAt(i)=='}' && ele=='{' )|| ( s.charAt(i)==']' && ele=='[' ) )
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        if(stack.empty())
            return true;
        return false;
    }
}