class Solution {
    public int singleNumber(int[] nums) {
        
        // Implementing hashmap but it will use extra space
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,2);
            }
            else{
                map.put(i,1);
            }
        }
        for(int i:nums){
            if(map.get(i)==1)
                return i;
        }
        return 0;
    }
}
