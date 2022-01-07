class Solution {
    public int removeDuplicates(int[] nums) {
        
        int start=-1;
        int count=0;
        for(int i=1;i<=nums.length;i++) {
            if(i<nums.length && nums[i]==nums[i-1]) {
                count++;
            }
            else {
                if(count>=1) {
                   
                    start++;
                    // System.out.println("here "+nums[i-1]+" "+nums[start]);
                    nums[start++]=nums[i-1];
                    nums[start]=nums[i-1];
                }
                else if(count==0){
                   // System.out.println("here "+nums[i-1]+" "+start);
                    start++;
                   // System.out.println("here "+nums[i-1]+" "+start);
                    nums[start]=nums[i-1];
                  //  System.out.println("here "+nums[i-1]+" "+nums[start]);
                }
                
                count=0;
            }
        }
        
        return ++start;
    }
}