class Solution {
    public int minDeletions(String s) {
        
        int count =0;
        
        int[] arr = new int[26];
        
        for(int i=0;i<s.length();i++) {
            arr[s.charAt(i)-'a']+=1;
        }
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++) {
            while(arr[i]!=0 && !set.add(arr[i])) {
                count++;
                arr[i]--;
            }
        }
        
        return count;
    }
}