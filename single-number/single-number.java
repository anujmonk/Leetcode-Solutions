class Solution {
    public int singleNumber(int[] nums) {
     
     /* There are two methods which dont use extra space
            1. Math
                2*(a+b+c) - a+b+c+a+b = c
                
                It is given that every element appears twice except for one so we can use this                         technique.
                
            2. XOR
                XOR each element in the array and at last you will get the element which appears once                 as XOR of true and true is false and XOR of true and false is true.  
        */   
     
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
