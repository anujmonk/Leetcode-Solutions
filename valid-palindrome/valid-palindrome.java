class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toLowerCase();
        
        int low=0,high=s.length()-1;
        
        while(low<high) {
            
        //     if((98<=(int)s.charAt(low) && (int)s.charAt(low)<=122) && (98<=(int)s.charAt(high) && (int)s.charAt(high)<=122)) {
        //         if(s.charAt(low)==s.charAt(high))
        //         {
        //             low++;
        //             high--;
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        //     else{
        //         if(98<=(int)s.charAt(low) && (int)s.charAt(low)>=122) {
        //             high--;
        //         }
        //         else{
        //             low++;
        //         }
        //     }
        // }
        // return true;
            
        char start=s.charAt(low);
        char end=s.charAt(high);
        
        if(Character.isLetterOrDigit(start) && Character.isLetterOrDigit(end)) {
            if(start==end) {
                low++;
                high--;
            }
            else{
                return false;
            }
        }
        else{
            if(Character.isLetterOrDigit(start)) {
                high--;
            }
            else{
                low++;
            }
        }
    }
    return true;
    }
}