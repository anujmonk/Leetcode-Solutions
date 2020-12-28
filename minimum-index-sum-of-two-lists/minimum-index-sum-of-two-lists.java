class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> list=new HashMap<String,Integer>();
        
        // Putting list1 in HashMap
        for(int i=0;i<list1.length;i++){
            list.put(list1[i],i);
        }
        
        // Creating a HashMap of common strings with key and value as sum of indexes
        HashMap<String,Integer> common=new HashMap<String,Integer>();
        for(int i=0;i<list2.length;i++){
            if(list.containsKey(list2[i]))
                common.put(list2[i],list.get(list2[i])+i);
        }
                
        // Finding minimum sum of indexes
        int min=list1.length+list2.length;
        for(int i:common.values()){
            if(min>i)
                min=i;
        }
        
        int len=0;
        for(int i:common.values()){
            if(min==i)
                len++;
        }
        String[] out=new String[len];
        len=0;
        for(Map.Entry<String,Integer> entry : common.entrySet()){
            if(entry.getValue()==min)
            {
                out[len]=entry.getKey();
                len++;
            }
        }
        return out;
    }
}
