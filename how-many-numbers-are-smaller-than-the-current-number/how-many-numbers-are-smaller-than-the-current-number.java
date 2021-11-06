class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
            int count=0;
            if(map.containsKey(nums[i])) {
                ans[i]=map.get(nums[i]);
                continue;
            }
            for(int j=0;j<nums.length;j++) {
                if(nums[j]<nums[i]) {
                    count++;
                }
            }
            map.put(nums[i],count);
            ans[i]=count;
        }
        return ans;
    }
}