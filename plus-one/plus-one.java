class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        int sum=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=digits.length-1;i>=0;i--){
            if(i==digits.length-1){
                sum=(digits[i]+carry+1)%10;
                carry=(digits[i]+carry+1)/10;
            }
            else{
                sum=(digits[i]+carry)%10;
                carry=(digits[i]+carry)/10;
            }
            list.add(sum);
        }
        if(carry==1)
            list.add(1);
       // System.out.print(list);
        int[] out=new int[list.size()];
        
        for(int i=0;i<list.size();i++){
            out[out.length-i-1]=list.get(i);    
        }
        return out;
    }
}