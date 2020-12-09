class Solution {
    public int[] sortedSquares(int[] A) {
        // Brute Force - Squaring and then sorting using Arrays.sort()
        // O(nlog(n)) time and space O(1)
       /* for(int i=0;i<A.length;i++)
            A[i]=A[i]*A[i];
        Arrays.sort(A);
        return A;
        */
        
        // Two poitner approach : O(n) time complexity and O(n) space complexity
        // Nick White's Video: Comparing negative value with positive value whichever value is gretaer         // that value's square will be stored in end of result array
        
        int[] result =new int[A.length];
        int start = 0;
        int end = A.length-1;
        
        for(int i=A.length-1;i>=0;i--){
            if(Math.abs(A[start])>A[end]){
                result[i]=A[start]*A[start];
                start++;
            }
            else{
                result[i]=A[end]*A[end];
                end--;
            }
        }
        return result;
    }class Solution {
2
    public int[] sortedSquares(int[] A) {
3
        // Brute Force - Squaring and then sorting using Arrays.sort()
4
        
5
        for(int i=0;i<A.length;i++)
6
            A[i]=A[i]*A[i];
7
        Arrays.sort(A);
8
        return A;
9
    }
10
}
11

    
    
}
