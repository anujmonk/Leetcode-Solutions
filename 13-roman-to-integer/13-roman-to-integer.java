class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("IV",4);
        map.put("IX",9);
        map.put("XL",40);
        map.put("XC",90);
        map.put("CM",900);
        map.put("CD",400);
                
        int sum=0;
        for(int i=s.length()-1;i>=0;i--){
            int prev=i-1;
            StringBuffer buffer=new StringBuffer();
            if(prev>=0) {
                buffer.append(s.charAt(prev));
                buffer.append(s.charAt(i));
                if(map.containsKey(buffer.toString())) {
                    sum=sum+map.get(buffer.toString());
                    i--;
                    continue;
                }
                else{
                    buffer=new StringBuffer();
                    buffer.append(s.charAt(i));
                    sum+=map.get(buffer.toString());
                    continue;
                }
            }
            else{
                buffer=new StringBuffer();
                buffer.append(s.charAt(i));
                sum+=map.get(buffer.toString());
            }
        }
        return sum;
    }
}