class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result=new ArrayList<Integer>();
        Set<Integer> set1=new HashSet<Integer>();
        for(int i:nums1){
            set1.add(i);
        }
        
        for(int i:nums2){
            if(set1.contains(i)){
                set1.remove(i);
                result.add(i);
            }
        }
        int[] out =new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            out[i]=result.get(i);
        }
        return out;
    }
}
