class Solution {
    
    private Map<Integer,Integer> map = new HashMap<>();
    
    public int climbStairs(int n) {
        
        if(n<=0) {
            return 0;
        }
        if(n<=2) {
            return n;
        }
        
        int result;
        if(map.containsKey(n)) {
            return map.get(n);
        }
        else{
            result= climbStairs(n-1) + climbStairs(n-2);
        }
        
        map.put(n,result);
        return result;
    }
}