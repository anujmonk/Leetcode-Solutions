class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        // Monotonic Stack - Next greater or when a sequence needs to be in increasing order property
        int[] ans=new int[nums1.length];
        
        int[] nextGreater = new int[nums2.length];
        Stack<Integer> stack= new Stack<>();
        stack.push(0);
        for(int i=1;i<nums2.length;i++) {
            if(stack.isEmpty()) {
                nextGreater[i]=-1;
            }
            else if(nums2[i]>nums2[stack.peek()]) {
                while(!stack.isEmpty() && nums2[i]>nums2[stack.peek()]) {
                    int index= stack.pop();
                    nextGreater[index]=nums2[i];
                }
                stack.push(i);
            }
            else{
                stack.push(i);
            }
        }
     
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++) {
            map.put(nums2[i],i);
        }
        
        for(int i=0;i<nums1.length;i++) {
            if(map.containsKey(nums1[i])) {
                ans[i]= nextGreater[map.get(nums1[i])]==0?-1:nextGreater[map.get(nums1[i])];
            }
        }
        
        return ans;
    }
}