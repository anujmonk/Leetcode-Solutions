class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i]))
                map.put(nums1[i],map.get(nums1[i])+1);
            else
                map.put(nums1[i],1);    
        }
        for(int num:nums2)
        {
            if(map.get(num)!=null&&map.get(num)>0)
            {
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int[] res=new int[list.size()]; 
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
    return res;
        
    }
}
