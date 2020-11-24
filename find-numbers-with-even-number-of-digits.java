class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(findDigit(nums[i])%2==0)
                count++;
        }
        return count;
    }
        public int findDigit(int a){
            int len=0;
            if(a==0)
                len=1;
            while(a!=0){
                a=a/10;
                len++;
            }
            return len;
        }
}
