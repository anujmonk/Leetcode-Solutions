class Solution {
    public int maximumSwap(int num) {
        
        int ans =0;
        // Decreasing sequence and then if it breaks then change that number with the next maximum number on right
        
        List<Integer> list = new ArrayList<>();
        int k=num;
        while(k!=0) {
            int res=k%10;
            k=k/10;
            list.add(res);
        }
        Collections.reverse(list);
       // System.out.println(list);
        for(int i=0;i<list.size()-1;i++) {
            int j=i+1;
            
            if(list.get(i)<list.get(j)) {
                int toChange=i;
                int with=j;
                for(j=j+1;j<list.size();j++) {
                    // Maximum number's index needed
                    if(list.get(with)<=list.get(j)) {
                        with=j;
                    }
                }
                
                // Swapping the two indexes
              //  Collections.swap(list,toChange,with);
                // find the lowest number on left to swap it with
                System.out.println("Tochange: "+toChange);
                int small=toChange;
                for(int m=toChange-1;m>=0;m--) {
                    if(list.get(m)<list.get(with)) {
                        small=m;
                    }
                }
                System.out.println(small+" "+with);
                Collections.swap(list,small,with);
                break;
            }
        }
        
        for(int i=0;i<list.size();i++) {
            ans=ans*10+list.get(i);
        }
        
        return ans;
    }
}