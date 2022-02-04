class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        // Used concept of range sum(in a sorted array, on different range sum is put)
        int[] prefix = new int[1001];
        
        for(int[] trip:trips) {
            prefix[trip[1]]+=trip[0];
            prefix[trip[2]]+=-trip[0];
        }
        
        int sum=0;
        for(int i=0;i<prefix.length;i++) {
            prefix[i]+=sum;
            sum=prefix[i];
            if(prefix[i]>capacity) {
                return false;
            }
        }
        return true;
    }
}