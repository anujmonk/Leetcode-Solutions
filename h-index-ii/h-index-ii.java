class Solution {
    public int hIndex(int[] citations) {
        int low=0,high=citations.length-1;
        
        while(low<=high) {
            int mid=low+(high-low)/2;
            int h=citations.length-mid;
            
            if(citations[mid]==h) {
                return citations.length-mid;
            }
            else if(citations[mid]<h){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return citations.length-low;
    }
}