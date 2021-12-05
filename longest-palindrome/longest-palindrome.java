class Solution {
    // Maintain counter for each character if it is of even length include and if it is of odd length 
    // then if count greater than 1 than subtract count with 1 and include it.
    public int longestPalindrome(String s) {
        
        // We can use Hashmap too but with HashSet this can be done in a faster way
        Set<Character> set = new HashSet<>();
        int ans=0;
        for(int i=0;i<s.length();i++) {
            if(set.contains(s.charAt(i))){
                ans+=2;
                set.remove(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
            }
        }
        if(!set.isEmpty()){
            ans+=1;
        }
        return ans;
    }
}