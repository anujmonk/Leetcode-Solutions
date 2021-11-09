class Solution {
    public String reverseWords(String s) {
        List<StringBuffer> arr=new ArrayList();
        int start=0;
        StringBuffer buffer = new StringBuffer();
        boolean first=false;
        for(int i=0;i<s.length();i++) {
            while(i<s.length() && s.charAt(i)==' ') {
                if(!first) {
                    if(buffer.length()!=0) {
                        arr.add(buffer);
                        buffer=new StringBuffer();
                        first=!first;
                    }
                }
                i++;
            }
            if(i>=s.length())
                break;
            if(first){
                first=!first;
            }
            
            buffer.append(s.charAt(i));
            }
        if(buffer.length()!=0) {
            arr.add(buffer);
        }
        reverseList(arr);
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<arr.size();i++){
            ans.append(arr.get(i));
            if(i!=arr.size()-1)
                ans.append(" ");
        }
        return ans.toString();
    }
    
    public void reverseList(List<StringBuffer> arr) {
        int low=0,high=arr.size()-1;
        System.out.println(arr);
        while(low<high) {
            StringBuffer temp=new StringBuffer(arr.get(low));
            arr.set(low,arr.get(high));
            arr.set(high,temp);
            low++;
            high--;
        }
        System.out.println(arr);
    }
}