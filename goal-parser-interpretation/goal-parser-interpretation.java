class Solution {
    public String interpret(String command) {
        StringBuilder out=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G')
                out.append('G');
            else if(i+1<command.length()){
                if(command.charAt(i)=='(' && command.charAt(i+1)==')')
                    out.append('o');
                else if(command.charAt(i)=='(' && command.charAt(i+1)=='a')
                    out.append("al");
            }
        }
        return out.toString();
    }
}
