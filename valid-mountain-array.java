class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;
        else{
            int max=0;
            
            // Finding Max index
            for(int i=1;i<arr.length;i++){
                if(arr[i]>arr[max])
                    max=i;
            }
            
            boolean increase=false;
            boolean decrease=false;
            int j=0;
            while(j<max){
                if(arr[j]<arr[j+1])
                    increase=true;
                else
                    return false;
                j++;
            }
            while(j<arr.length-1){
                if(arr[j]>arr[j+1])
                    decrease=true;
                else
                    return false;
                j++;
            }
            if(increase==true && decrease==true)
                return true;
            else
                return false;
        }
    }
}
